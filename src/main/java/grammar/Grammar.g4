grammar Grammar;

@parser::header { package grammar.gen; }
@lexer::header { package grammar.gen; }

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

start :  BEGIN expr* END;

function : FUNC VARIABLE expr* END;

expr : (literal | assign | VARIABLE | NL ) NL?;

assign : VARIABLE ASSIGN (VARIABLE | literal);

literal
    : HEX_LITERAL
    | BINARY_LITERAL
    | NUMBER_LITERAL
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
TOKENS	: ('tokens');
PARAM	: ('param');
DELETE 	: ('delete');
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
BEGIN	: ('begin') NL?;
END 	: ('end') NL?;
TRUE	: ('true');
FALSE 	: ('false');	
NULL	: ('null'); 
SEMICOLON : (';');
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
EXPONENT : ('^');
EXPONENT_ASSIGN : ('^=');
MODULUS : ('%');
MODULUS_ASSIGN : ('%=');

fragment
CHAR	: [a-zA-Z_];

VARIABLE	: ('@') CHAR+ (CHAR | INT_DIGIT)*;

HEX_LITERAL : ('0x') HEX_DIGIT+;

BINARY_LITERAL : ('0b') [0-1]+;

NUMBER_LITERAL	: INTEGER+ ('.')? INTEGER*;

fragment
INTEGER : ('0' | INT_DIGIT INT_DIGIT*);

fragment
HEX_DIGIT : [0-9] | [a-f] | [A-F];

fragment
INT_DIGIT : [0-9];

// EXPONENT : '^' ('+'|'-')? INT_DIGIT+ ;

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

NL :'\r'? '\n';

WS : [ \t\u000C]+ -> skip;

BLOCK_COMMENT
	: '/*' .*? '*/' -> skip
	;

LINE_COMMENT
	: '//' ~[\r\n]* -> skip
	;
