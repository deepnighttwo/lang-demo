grammar OTFQLGrammar ;

ql          : select from where;
select      : 'select' propsSel (',' propsSel)*;
from        : 'from' ID;
where       : 'where' boolExpr;

propsSel    : propFullName
            'as'
            ID;

propFullName: propName('.'propName)*;

propName    : ID
            | ID '['+INT']';

test        : ID;

literalStr  : '"' ID '"';

ID          : [a-zA-Z] [a-zA-Z0-9]*;

INT         : [0-9]+;

boolExprs   : boolExpr (boolOprt boolExpr)*;

boolExpr    : propFullName CompareOprt propFullName
            | literalStr CompareOprt propFullName
            | propFullName CompareOprt literalStr
            | literalStr CompareOprt literalStr
            | NOT boolExpr
            | '(' boolExpr ')'
            | boolExpr boolOprt boolExpr
            ;

tttt        : ID
            | ID boolOprt ID;

CompareOprt : EQUALS | BIGGER | SMALLER | BIGGEROREQ | SMALLEROREQ | NOTEQUAL;

boolOprt    : AND | OR ;

EQUALS      : '=';
BIGGER      : '>';
SMALLER     : '<';
BIGGEROREQ  : '>=';
SMALLEROREQ : '<=';
NOTEQUAL    : '!=';

NOT         : '!';
AND         : '&';
OR          : '|';

WS        : [ \t\n\r]+ -> skip;
