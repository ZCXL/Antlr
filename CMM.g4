grammar CMM;
import CommonLexerRules;

prog : stat+ 
	|functionDeclr
	;

stat :
	singleExpr
	| multiExpr
	;
singleExpr :
	assignStat
	| declrStat
	| ioStat
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
	WRITE '(' ID ',' expr ')' ';'
	;
read :
	READ '(' ID ')' ';'
	;
	
	
multiExpr :
	whileExpr
	| ifExpr
	;
ifExpr :
	IF conditionExpr block (ELSE IF conditionExpr block)* (ELSE block)?
	;
whileExpr :
	whileDoExpr
	|doWhileExpr
	;
whileDoExpr :
	WHILE condtionExpr block
	;
doWhileExpr :
	DO block WHILE conditionExpr
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

block : 
	'{' stat* '}'
	;
expr :
	ID '(' exprList? ')'
	|
type :
	INT | FLOAT | DOUBLE 
	;