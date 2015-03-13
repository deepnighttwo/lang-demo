grammar Query;
query     : select;
select    : 'select' colname (',' colname)* 'from' tablename;
colname   : ID;
tablename : ID;
ID        : [a-z]+;
WS        : [ \t\n\r]+ -> skip;
