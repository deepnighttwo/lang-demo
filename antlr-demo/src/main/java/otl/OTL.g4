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
            | ID LPAREN propFullName? (COMMA propFullName)* RPAREN      # FuncVar
            ;

propFullName: propName(DOT propName)*;

propName    : ID                                # Prop
            | ID LBRACK integerLiteral RBRACK   # ArrayProp
            ;



// bool part

boolExprs   : boolExpr (BoolOprt boolExpr)*;

boolExpr    : propVar CompareOprt propVar       # CompareBool
            | NOT boolExpr                      # NotBool
            | LPAREN boolExpr RPAREN            # ParenBool
            | boolExpr BoolOprt boolExpr        # ExprBool
            ;


integerLiteral
    :   HexLiteral
    |   OctalLiteral
    |   DecimalLiteral
    ;

booleanLiteral
    :   TRUE                                    # TrueBool
    |   FALSE                                   # FalseBool
    ;

//-----key words----

