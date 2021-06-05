grammar EZPython4;



PLUS_T:         '+' ;
MINUS_T:        '-' ;
MUL_T:          '*' ;
DIV_T:          '/' ;

ASSIGN_T:	    '=' ;

END_LINE_T:	    ';' ;
NL_T:           '\n' ;

INT_T:		[1-9][0-9]* | '0';
VARIABLE_T:	[a-zA-Z_][a-zA-Z0-9_]*;
WHITESPACE_T:  	[ \t\r\n]+ -> skip;

INT_TYPE_T:    'int' ;


program:
    (stmt|NL_T)* EOF;

stmt:
	(expr
	| variableStmt);


expr:
    arithmExpr ;

arithmExpr:
	arithmExpr (PLUS_T| MINUS_T) arithmExpr | term;

term:
    term (MUL_T|DIV_T) term
    | value;

variableStmt:
    type VARIABLE_T ASSIGN_T value END_LINE_T;


value:
    number
    | VARIABLE_T ;

number:
    INT_T;

type:
	numberType;

numberType:
     INT_TYPE_T;









