K
=================
a sample program. This will be a simple functional programming language. 
It's goal is to be simple enough for me to eventually be able to compile a natural langague into.

Example Code:
```
begin 
	logging on		// turn logging on, should be on by default
	
	// function definitions
	 
	function @f
		print "inside function f()"
		@p1 = param 1 
		@p2 = param 2
		print "param 1 = " @p1
		print "param 2 = " @p2
	end
	
	function @g
		function @h
			print "inside function h()"
			@v = 10
			@x = 20
		end
	
		print "inside function g()"
		@v = 1
		print "v = " @v
		@h
	end
	
	print "Welcome to my program demo"
	@a = 10 	// base 10
	print "set a to 10 = " @a
	
	@d + @p
	
	print "begin assign test"
	@a + 2
	print "add 2 to a = " @a
	
	@a + @a
	print "a = " @a
	print "end assign test"

	@a -= 4
	print "a = " @a
	
	@z = 33
	print "z = " @z
	
	@z - @a
	print "subtract a from z = " @z
	
	@z * 3
	print "multiply 3 and z = " @z

	@z / 3.14
	print "divide z by 3.14 = " @z
	
	@a = 0xff 	// base 16
	print "a = " @a
	
	@a++
	print "increment a = " @a
	
	@b = 0b1000
	print "b = " @b
	
	@b--
	print "decrement b = " @b
	
	@c = 100000
	print "c = " @c
	
	@e = 7
    @e ^ 13
	print "7 ^ 13 = " @e
	
    @e = 10
    @e % 8
	print "10 % 8 = " @e
	
	print "before function test"
	@f 10 "2nd param"
	@g
	print "after function test"
	
	print "pass by value test"
	@b = @c	
	print "b = " @b
	print "c = " @c
	@b++
	print "b = " @b
	print "c = " @c

	print "concat strings and vars test"
	@foo = "foo"
	@bar = "bar"
	print "f = " @foo
	print "b = " @bar
	@fb = @foo
	@fb + @bar
	print "f = " @foo
	print "b = " @bar
	print "fb = " @fb
	
	logging on 
	@y = 0b1010011
	logging off

	print "Memory Dump:"
	dump
	print "Delete everything except function f"
	delete @a @b @c @y @fb @foo @bar @p @g @d @z @e
	dump
	
	print "Tokens:"
	tokens
end
```

Output:
```
Reading file: k/program.k
Logging turned on
Welcome to my program demo
set a to 10 = 10.0
WARN  k.K - Variable @p undefined, defaulting to 0.0
begin assign test
add 2 to a = 12.0
a = 24.0
end assign test
a = 20.0
z = 33.0
subtract a from z = 13.0
multiply 3 and z = 39.0
divide z by 3.14 = 12.420382165605096
a = 255.0
increment a = 256.0
b = 8.0
decrement b = 7.0
c = 100000.0
7 ^ 13 = 9.6889010407E10
10 % 8 = 2.0
before function test
inside function f()
param 1 = 10.0
param 2 = 2nd param
inside function g()
v = 1.0
inside function h()
after function test
pass by value test
b = 100000.0
c = 100000.0
b = 100001.0
c = 100000.0
concat strings and vars test
f = foo
b = bar
f = foo
b = bar
fb = foobar
Logging turned on
Logging turned off
Memory Dump:
@p	: 0.0
@fb	: foobar
@z	: 12.420382165605096
@y	: 83.0
@b	: 100001.0
@c	: 100000.0
@foo	: foo
@a	: 256.0
@f	: FUNC()
	@p2	: 2nd param
	@p1	: 10.0
@g	: FUNC()
	@v	: 1.0
	@h	: FUNC()
		@v	: 10.0
		@x	: 20.0
@d	: 0.0
@e	: 2.0
@bar	: bar

Delete everything except function f
@f	: FUNC()
	@p2	: 2nd param
	@p1	: 10.0

Tokens:
BEGIN [begin], SYMBOL [main], NEWLINE [
], LOGON [logging on], NEWLINE [
], NEWLINE [
], NEWLINE [
], NEWLINE [
], FUNC [function], VARIABLE [@f], NEWLINE [
], PRINT [print], STRING_LITERAL ["inside function f()"], NEWLINE [
], VARIABLE [@p1], ASSIGN [=], PARAM [param], NUMBER_LITERAL [1], NEWLINE [
], VARIABLE [@p2], ASSIGN [=], PARAM [param], NUMBER_LITERAL [2], NEWLINE [
], PRINT [print], STRING_LITERAL ["param 1 = "], VARIABLE [@p1], NEWLINE [
], PRINT [print], STRING_LITERAL ["param 2 = "], VARIABLE [@p2], NEWLINE [
], END [end], NEWLINE [
], NEWLINE [
], FUNC [function], VARIABLE [@g], NEWLINE [
], FUNC [function], VARIABLE [@h], NEWLINE [
], PRINT [print], STRING_LITERAL ["inside function h()"], NEWLINE [
], VARIABLE [@v], ASSIGN [=], NUMBER_LITERAL [10], NEWLINE [
], VARIABLE [@x], ASSIGN [=], NUMBER_LITERAL [20], NEWLINE [
], END [end], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["inside function g()"], NEWLINE [
], VARIABLE [@v], ASSIGN [=], NUMBER_LITERAL [1], NEWLINE [
], PRINT [print], STRING_LITERAL ["v = "], VARIABLE [@v], NEWLINE [
], VARIABLE [@h], NEWLINE [
], END [end], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["Welcome to my program demo"], NEWLINE [
], VARIABLE [@a], ASSIGN [=], NUMBER_LITERAL [10], NEWLINE [
], PRINT [print], STRING_LITERAL ["set a to 10 = "], VARIABLE [@a], NEWLINE [
], NEWLINE [
], VARIABLE [@d], ADD [+], VARIABLE [@p], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["begin assign test"], NEWLINE [
], VARIABLE [@a], ADD [+], NUMBER_LITERAL [2], NEWLINE [
], PRINT [print], STRING_LITERAL ["add 2 to a = "], VARIABLE [@a], NEWLINE [
], NEWLINE [
], VARIABLE [@a], ADD [+], VARIABLE [@a], NEWLINE [
], PRINT [print], STRING_LITERAL ["a = "], VARIABLE [@a], NEWLINE [
], PRINT [print], STRING_LITERAL ["end assign test"], NEWLINE [
], NEWLINE [
], VARIABLE [@a], SUB_ASSIGN [-=], NUMBER_LITERAL [4], NEWLINE [
], PRINT [print], STRING_LITERAL ["a = "], VARIABLE [@a], NEWLINE [
], NEWLINE [
], VARIABLE [@z], ASSIGN [=], NUMBER_LITERAL [33], NEWLINE [
], PRINT [print], STRING_LITERAL ["z = "], VARIABLE [@z], NEWLINE [
], NEWLINE [
], VARIABLE [@z], SUB [-], VARIABLE [@a], NEWLINE [
], PRINT [print], STRING_LITERAL ["subtract a from z = "], VARIABLE [@z], NEWLINE [
], NEWLINE [
], VARIABLE [@z], MUL [*], NUMBER_LITERAL [3], NEWLINE [
], PRINT [print], STRING_LITERAL ["multiply 3 and z = "], VARIABLE [@z], NEWLINE [
], NEWLINE [
], VARIABLE [@z], DIV [/], NUMBER_LITERAL [3.14], NEWLINE [
], PRINT [print], STRING_LITERAL ["divide z by 3.14 = "], VARIABLE [@z], NEWLINE [
], NEWLINE [
], VARIABLE [@a], ASSIGN [=], HEX_LITERAL [0xff], NEWLINE [
], PRINT [print], STRING_LITERAL ["a = "], VARIABLE [@a], NEWLINE [
], NEWLINE [
], VARIABLE [@a], INC [++], NEWLINE [
], PRINT [print], STRING_LITERAL ["increment a = "], VARIABLE [@a], NEWLINE [
], NEWLINE [
], VARIABLE [@b], ASSIGN [=], BINARY_LITERAL [0b1000], NEWLINE [
], PRINT [print], STRING_LITERAL ["b = "], VARIABLE [@b], NEWLINE [
], NEWLINE [
], VARIABLE [@b], DEC [--], NEWLINE [
], PRINT [print], STRING_LITERAL ["decrement b = "], VARIABLE [@b], NEWLINE [
], NEWLINE [
], VARIABLE [@c], ASSIGN [=], NUMBER_LITERAL [100000], NEWLINE [
], PRINT [print], STRING_LITERAL ["c = "], VARIABLE [@c], NEWLINE [
], NEWLINE [
], VARIABLE [@e], ASSIGN [=], NUMBER_LITERAL [7], NEWLINE [
], VARIABLE [@e], EXPONENT [^], NUMBER_LITERAL [13], NEWLINE [
], PRINT [print], STRING_LITERAL ["7 ^ 13 = "], VARIABLE [@e], NEWLINE [
], NEWLINE [
], VARIABLE [@e], ASSIGN [=], NUMBER_LITERAL [10], NEWLINE [
], VARIABLE [@e], MODULUS [%], NUMBER_LITERAL [8], NEWLINE [
], PRINT [print], STRING_LITERAL ["10 % 8 = "], VARIABLE [@e], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["before function test"], NEWLINE [
], VARIABLE [@f], NUMBER_LITERAL [10], STRING_LITERAL ["2nd param"], NEWLINE [
], VARIABLE [@g], NEWLINE [
], PRINT [print], STRING_LITERAL ["after function test"], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["pass by value test"], NEWLINE [
], VARIABLE [@b], ASSIGN [=], VARIABLE [@c], NEWLINE [
], PRINT [print], STRING_LITERAL ["b = "], VARIABLE [@b], NEWLINE [
], PRINT [print], STRING_LITERAL ["c = "], VARIABLE [@c], NEWLINE [
], VARIABLE [@b], INC [++], NEWLINE [
], PRINT [print], STRING_LITERAL ["b = "], VARIABLE [@b], NEWLINE [
], PRINT [print], STRING_LITERAL ["c = "], VARIABLE [@c], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["concat strings and vars test"], NEWLINE [
], VARIABLE [@foo], ASSIGN [=], STRING_LITERAL ["foo"], NEWLINE [
], VARIABLE [@bar], ASSIGN [=], STRING_LITERAL ["bar"], NEWLINE [
], PRINT [print], STRING_LITERAL ["f = "], VARIABLE [@foo], NEWLINE [
], PRINT [print], STRING_LITERAL ["b = "], VARIABLE [@bar], NEWLINE [
], VARIABLE [@fb], ASSIGN [=], VARIABLE [@foo], NEWLINE [
], VARIABLE [@fb], ADD [+], VARIABLE [@bar], NEWLINE [
], PRINT [print], STRING_LITERAL ["f = "], VARIABLE [@foo], NEWLINE [
], PRINT [print], STRING_LITERAL ["b = "], VARIABLE [@bar], NEWLINE [
], PRINT [print], STRING_LITERAL ["fb = "], VARIABLE [@fb], NEWLINE [
], NEWLINE [
], LOGON [logging on], NEWLINE [
], VARIABLE [@y], ASSIGN [=], BINARY_LITERAL [0b1010011], NEWLINE [
], LOGOFF [logging off], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["Memory Dump:"], NEWLINE [
], DUMP [dump], NEWLINE [
], PRINT [print], STRING_LITERAL ["Delete everything except function f"], NEWLINE [
], DELETE [delete], VARIABLE [@a], VARIABLE [@b], VARIABLE [@c], VARIABLE [@y], VARIABLE [@fb], VARIABLE [@foo], VARIABLE [@bar], VARIABLE [@p], VARIABLE [@g], VARIABLE [@d], VARIABLE [@z], VARIABLE [@e], NEWLINE [
], DUMP [dump], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["Tokens:"], NEWLINE [
], TOKENS [tokens], NEWLINE [
], END [end], NEWLINE [
], null [<EOF>], 


 
```
