grammar BooleanExpr;
booleanExpr
    :   andExpr ('OR' andExpr)*;
andExpr :   notExpr (('AND' | ' ' ) notExpr)*;
notExpr :   kppExpr ('NOT' kppExpr);
kppExpr :   keywordExpr|phraseExpr|proximityExpr|'(' booleanExpr ')';
keywordExpr
    :CHAR+;
phraseExpr
    :   '"' keywordExpr '"';

OR : 'OR' ;
AND : 'AND' ;
T__19 : ' ' ;
NOT : 'NOT' ;
LPAREN : '(' ;
RPAREN : ')' ;
T__21 : '"' ;
TILDE : '~' ;
proximityExpr
    :   keywordExpr|phraseExpr '~' INT;
CHAR    :   ('A'..'Z') | ('a'..'z');
INT :   '0'..'9'+;
