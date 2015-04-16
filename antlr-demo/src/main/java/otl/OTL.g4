grammar OTL ;
import LiteralVars;

ql          : select from (where)?;
select      : SELECT propsSel (COMMA propsSel)*;
from        : FROM ID;
where       : WHERE boolExprs;


// prop part
propsSel    : propVar (AS ID)?;

propVar     : propFullName                                              # DirectPropVar
            | LPAREN propVar RPAREN                                     # Parens
            | propVar op=(MUL |DIV ) propVar                            # MulDiv
            | propVar op=(ADD |SUB ) propVar                            # AddSub
            | integerLiteral                                            # IntVar
            | FloatingPointLiteral                                      # FloatVar
            | CharacterLiteral                                          # CharVar
            | StringLiteral                                             # StringVar
            | booleanLiteral                                            # BooleanVar
            | NULL                                                      # NullVar
            | ID LPAREN propFullName? (COMMA propFullName)* RPAREN       # FuncVar
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

