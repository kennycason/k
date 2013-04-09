grammar Grammar;

@parser::header { package gen; }
@lexer::header { package gen; }

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

expr : literal | COMMENT;

literal
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
    |   CHARACTER_LITERAL
    |   STRING_LITERAL
    |   TRUE
    |   FALSE
    |   NULL
    ;
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
 
BEGIN	: ('begin');
END 	: ('end');
TRUE	: ('true');
FALSE 	: ('false');	
NULL	: ('null'); 


HEX_LITERAL : '0x' HEX_DIGIT+;

DECIMAL_LITERAL : ('0' | INT_DIGIT INT_DIGIT*);

OCTAL_LITERAL : '0o' ('0'..'7')+;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F');

fragment
INT_DIGIT : ('0'..'9');

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

WS : [ \t\r\nu000C]+ -> channel(HIDDEN);

COMMENT
    :   '//' ()* ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN);