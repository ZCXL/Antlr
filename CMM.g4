grammar CMM;
prog : 
	(stat NEWLINE?)+ 
	;

stat :
	singleExpr
	| multiExpr
	| functionDeclr
	| anotationExpr
	;
singleExpr :
	assignStat
	| declrStat
	| ioStat
	| 'return' expr? ';'
	;
ioStat :
	write
	| read
	;
declrStat :
	type ID ('=' expr)? ';'
	;
assignStat :
	ID '=' expr ';'
	;
write :
	'write' '(' ID ')' ';'
	;
read :
	'read' '(' ')'
	;
	

multiExpr :
	whileExpr
	| ifExpr
	;
ifExpr :
	'if' expr block ('else' 'if' expr block)* ('else' block)?
	;
whileExpr :
	whileDoExpr
	|doWhileExpr
	;
whileDoExpr :
	'while' expr block
	;
doWhileExpr :
	'do' block 'while' expr
	;
	
	
functionDeclr :
	type ID '(' formalParameters? ')' block
	;
formalParameters :
	formalParameter (',' formalParameter)*
	;
formalParameter :
	type ID
	;
anotationExpr :
	'/*' .*? (NEWLINE '*' .*?)* '*/'
	;
block : 
	'{' (stat NEWLINE?)* '}'
	| singleExpr
	;
expr :
	ID '(' exprList? ')'
	| ID '[' expr ']'
	| '-' expr
	| '!' expr
	| expr '++'
	| expr '--'
	| expr '+=' expr
	| expr '-=' expr
	| expr '*=' expr
	| expr '/=' expr
	| expr ('*' | '/') expr
	| expr ('+' | '-') expr
	| expr ('>'|'<'|'=='|'!=') expr
	| ID 
	| read
	| NUMBER
	| '(' expr ')'
	;
exprList :
	expr (',' expr)*
	;
type :
	'int'
	|'float' 
	|'double' 
	|'void'
	;
	
ID : [a-zA-Z_] ([a-zA-Z_] | [0-9])*;
NUMBER :
	INT '.' INT EXP?
	|INT EXP
	|INT
	;
fragment INT : '0' | [1-9] [0-9]* ;
fragment EXP : [Ee][+|-]? INT ;
NEWLINE : '\r'? '\n' ;
DIGIT : [0-9];
ALPHA : [a-zA-Z];
STRING : '"' (ESC | ~["\\])* '"' ;
fragment ESC : '\\' (["\\/bfnrt] | UNICODE );
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9A-Za-z] ;
WS : [\t\n\r]+ ->skip ;