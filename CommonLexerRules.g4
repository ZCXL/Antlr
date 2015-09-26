lexer grammar CommonLexerRules;

ID : [a-zA-Z_] ([a-zA-Z_] | [0-9])*;
INT : 'int' ;
FLOAT : 'float' ;
DOUBLE : 'double' ;
WHILE : 'while' ;
DO : 'do' ;
IF : 'if';
ELSE : 'else'
NEWLINE : '\r'? '\n' ;
WS : [\t]+ ->skip ;
DIGIT : [0-9];
ALPHA : [a-zA-Z];

READ : 'read' ;
WRITE : 'write' ; 