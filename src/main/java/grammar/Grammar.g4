grammar Grammar;

@parser::header { package grammar.gen; }
@lexer::header { package grammar.gen; }

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

expr : literal | assign | VARIABLE;

assign : VARIABLE ASSIGN (VARIABLE | literal);

literal
    : HEX_LITERAL
    | BINARY_LITERAL
    | INTEGER_LITERAL
    | CHARACTER_LITERAL
    | STRING_LITERAL
    | TRUE
    | FALSE
    | NULL
    ;
    
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

// keywords
LOGON	: ('logging on');
LOGOFF	: ('logging off');
DUMP	: ('dump');
PRINT	: ('print');
FUNC	: ('function');
IF		: ('if');
ELSE	: ('else');
ELSEIF	: ELSE IF;
LOOP 	: ('loop');
BREAK	: ('break');
BEGIN	: ('begin');
END 	: ('end');
TRUE	: ('true');
FALSE 	: ('false');	
NULL	: ('null'); 
ASSIGN	: ('=');
INC	: ('++');
DEC	: ('--');
ADD	: ('+');
ADD_ASSIGN	: ('+=');
SUB : ('-');
SUB_ASSIGN	: ('-=');
DIV	: ('/');
DIV_ASSIGN	: ('/=');
MUL: ('*');
MUL_ASSIGN	: ('*=');

fragment
CHAR	: [a-zA-Z_];

VARIABLE	: ('@') CHAR+ (CHAR | INT_DIGIT)*;

HEX_LITERAL : ('0x') HEX_DIGIT+;

BINARY_LITERAL : ('0b') [0-1]+;

INTEGER_LITERAL : ('0' | INT_DIGIT INT_DIGIT*);

fragment
HEX_DIGIT : [0-9] | [a-f] | [A-F];

fragment
INT_DIGIT : [0-9];

EXPONENT : '^' ('+'|'-')? INT_DIGIT+ ;

CHARACTER_LITERAL
    :   '\'' ( ESCAPE_SEQUENCE | ~('\''|'\\') ) '\''
    ;

STRING_LITERAL
    :  '"' ( ESCAPE_SEQUENCE | ~('\\'|'"') )* '"'
    ;

fragment
ESCAPE_SEQUENCE
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESCAPE
    ;

fragment
UNICODE_ESCAPE
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
    
ACTION : '{' ( ACTION | ~[{}] )* '}' ;

SYMBOL : CHAR+;

WS : [ \t\r\n\u000C]+ -> skip;

BLOCK_COMMENT
	: '/*' .*? '*/' -> skip
	;

LINE_COMMENT
	: '//' ~[\r\n]* -> skip
	;
