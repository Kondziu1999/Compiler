grammar EZPython4;
@header { package parser;}



EQ:             '==';
NEQ:            '≠';
LTE:            '<=';
GTE:            '>=';
GT:             '>';
LT:             '<';

PLUS_T:         '+' ;
MINUS_T:        '-' ;
MUL_T:          '*' ;
DIV_T:          '/' ;
RBRACKET_T: 	')' ;
LBRACKET_T:     '(' ;
ASSIGN_T:	    '=' ;
TRUE_T:        	'true';
FALSE_T:       	'false';
OR_T:          	'or' ;
NOT_T:         	'not' ;
AND_T:        	'and';
END_LINE_T:	    ';' ;
NL_T:           '\n' ;
INT_TYPE_T:    'int' ;
BOOL_TYPE_T:    'bool';
STRING_TYPE_T:    'string';
QUOTE_T:        '"' ;

WHILE_T:       	'while';
LBRACE_T:       '{' ;
RBRACE_T:       '}' ;


INT_T:		[1-9][0-9]* | '0';
STRING_T:       QUOTE_T[a-zA-Z_0-9]*QUOTE_T ;
VARIABLE_T:	[a-zA-Z_][a-zA-Z0-9_]*;
WHITESPACE_T:  	[ \t\r\n]+ -> skip;




program:
    (stmt|NL_T)* EOF;

stmt:
	(expr
	| variableStmt
	| whileStmt);


expr:
    arithmExpr ;

arithmExpr:
	arithmExpr (PLUS_T| MINUS_T) arithmExpr | term;

term:
    term (MUL_T|DIV_T) term
    | LBRACKET_T arithmExpr RBRACKET_T
    | value;

variableStmt:
	BOOL_TYPE_T VARIABLE_T ASSIGN_T logicExpr END_LINE_T
	| type VARIABLE_T ASSIGN_T (value | arithmExpr) END_LINE_T
	| STRING_TYPE_T VARIABLE_T ASSIGN_T  STRING_T  END_LINE_T;


value:
    VARIABLE_T
    |number;

logicalVal:
	TRUE_T
	| FALSE_T;

logicExpr:
    logicalAND
    | logicalOR
    | logicalTerm
    | logicalVal;


logicalOR:
    logicalVal OR_T logicalVal
    | logicalTerm OR_T logicalTerm
    | logicalTerm OR_T logicalVal
    | logicalVal OR_T logicalTerm;

logicalAND:
    logicalVal AND_T logicalVal
    | logicalTerm AND_T logicalTerm
    | logicalTerm AND_T logicalVal
    | logicalVal AND_T logicalTerm;

logicalTerm:
    value (EQ|NEQ|GTE|LTE|GT|LT) value
    |value;


number:
    INT_T;

type:
     numberType;

numberType:
     INT_TYPE_T;


codeSection:
	(stmt)*;



whileStmt:
    WHILE_T LBRACKET_T logicExpr RBRACKET_T LBRACE_T codeSection RBRACE_T;