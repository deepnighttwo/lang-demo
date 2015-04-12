grammar OTFQLGrammar ;
import LiteralVars;

ql          : select from (where)?;
select      : SELECT propsSel (COMMA propsSel)*;
from        : FROM ID;
where       : WHERE boolExprs;

numExpr     :
            | LPAREN numExpr RPAREN                         # parens
            |numExpr op=(MUL |DIV ) numExpr      # MulDiv
            | numExpr op=(ADD |SUB ) numExpr      # AddSub
            | numberLiteral                                 # number
            | propFullName                                  # propVar

            ;


// prop part
propsSel    : propVar (AS ID)?;

propVar     : propFullName                                              # DirectPropVar
            | numExpr                                                   # NumExprVar
            | literal                                                   # literalVar
            | ID LPAREN propFullName (COMMA propFullName)* RPAREN       # FuncVar
            ;

propFullName: propName(DOT propName)*;

propName    : ID                                # prop
            | ID LBRACK integerLiteral RBRACK   # arrayProp
            ;



// bool part

boolExprs   : boolExpr (BoolOprt boolExpr)*;

boolExpr    : propVar CompareOprt propVar
            | NOT boolExpr
            | LPAREN boolExpr RPAREN
            | boolExpr BoolOprt boolExpr
            ;


//------------------lexer------------


CompareOprt : EQUALS | BIGGER | SMALLER | BIGGEROREQ | SMALLEROREQ | NOTEQUAL;

BoolOprt    : AND | OR ;



literal
    :   integerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   booleanLiteral
    |   NULL
    ;

integerLiteral
    :   HexLiteral
    |   OctalLiteral
    |   DecimalLiteral
    ;

numberLiteral
    :   integerLiteral
    |   FloatingPointLiteral
    ;

booleanLiteral
    :   TRUE
    |   FALSE
    ;

//-----key words----

