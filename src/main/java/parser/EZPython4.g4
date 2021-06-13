grammar EZPython4;
@header { package parser;}



EQ:             '==';
NEQ:            '!=';
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
DOUBLE_TYPE_T:   'double';
INT_TYPE_T:    'int' ;
BOOL_TYPE_T:    'bool';
STRING_TYPE_T:    'string';
QUOTE_T:        '"' ;
FUNCTION_T:    	'function';
IF_T :          'if';
WHILE_T:       	'while';
LBRACE_T:       '{' ;
RBRACE_T:       '}' ;
PRINT_T:        'print';
COMMA_T:        ',';
DOT_T:          '.';

DOUBLE_T:	[0-9]+DOT_T[0-9]*;

INT_T:		[1-9][0-9]* | '0';
STRING_T:       QUOTE_T(.)*QUOTE_T ;
VARIABLE_T:	[a-zA-Z_][a-zA-Z0-9_]*;
WHITESPACE_T:  	[ \t\r\n]+ -> skip;




program:
    (stmt|NL_T)* EOF;

stmt:
	(expr
	| variableStmt
	| whileStmt
	| ifStmt
	| funcStmt
	| funcCall
	| printFunc
	| variableReAssignStmt) ;


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





variableReAssignStmt:
    VARIABLE_T ASSIGN_T ((value | arithmExpr) | logicExpr  | STRING_T ) END_LINE_T;

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
    INT_T
    |DOUBLE_T;


type:
     numberType;

numberType:
     INT_TYPE_T
     | DOUBLE_TYPE_T;




ifStmt:
    IF_T LBRACKET_T logicExpr RBRACKET_T LBRACE_T codeSection RBRACE_T;


codeSection:
	(stmt |NL_T)*;



whileStmt:
    WHILE_T LBRACKET_T logicExpr RBRACKET_T (NL_T)* LBRACE_T codeSection RBRACE_T;

funcStmt:
    FUNCTION_T VARIABLE_T LBRACKET_T  RBRACKET_T (NL_T)* LBRACE_T codeSection RBRACE_T;

funcCall:
    VARIABLE_T LBRACKET_T RBRACKET_T END_LINE_T;


printFunc:
    PRINT_T LBRACKET_T (STRING_T | (STRING_T COMMA_T VARIABLE_T) | VARIABLE_T) RBRACKET_T END_LINE_T;

