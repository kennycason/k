K
=================
a sample program. This will be a simple functional programming language. 
It's goal is to be simple enough for me to eventually be able to compile a natural langague into.

Example Code:
```
begin name
	logging off		// turn logging on
	
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
	
	@a += 2
	print "add 2 to a = " @a
	
	@a += @a
	print "a = " @a
	
	@a -= 4
	print "a = " @a
	
	@z = 33
	print "z = " @z
	
	@z -= @a
	print "subtract a from z = " @z
	
	
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
	@fb += @bar
	print "f = " @foo
	print "b = " @bar
	print "fb = " @fb
	
	logging on 
	@y = 0b1010011
	logging off

	print "Memory Dump:"
	dump
	
	print "Tokens:"
	tokens
end
```

Output:
```
Reading file: k/program.k
Logging turned off
Welcome to my program demo
set a to 10 = 10.0
add 2 to a = 12.0
a = 24.0
a = 20.0
z = 33.0
subtract a from z = 13.0
a = 255.0
increment a = 256.0
b = 8.0
decrement b = 7.0
c = 100000.0
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
TRACE k.K - assigning value 0b1010011 to @y
Logging turned off
Memory Dump:
@b	: 100001.0
@foo	: foo
@c	: 100000.0
@a	: 256.0
@f	: FUNC()
	@p2	: 2nd param
	@p1	: 10.0
	_ID	: 2.032437E7

@fb	: foobar
@g	: FUNC()
	@v	: 1.0
	@h	: FUNC()
		@v	: 10.0
		@x	: 20.0
		_ID	: 1.1546362E7

	_ID	: 3.182212E7

@z	: 13.0
@y	: 83.0
@bar	: bar
_ID	: 1.3419912E7


Tokens:
BEGIN [begin], SYMBOL [name], NEWLINE [
], LOGOFF [logging off], NEWLINE [
], NEWLINE [
], NEWLINE [
], NEWLINE [
], FUNC [function], VARIABLE [@f], NEWLINE [
], PRINT [print], STRING_LITERAL ["inside function f()"], NEWLINE [
], VARIABLE [@p1], ASSIGN [=], PARAM [param], INTEGER_LITERAL [1], NEWLINE [
], VARIABLE [@p2], ASSIGN [=], PARAM [param], INTEGER_LITERAL [2], NEWLINE [
], PRINT [print], STRING_LITERAL ["param 1 = "], VARIABLE [@p1], NEWLINE [
], PRINT [print], STRING_LITERAL ["param 2 = "], VARIABLE [@p2], NEWLINE [
], END [end], NEWLINE [
], NEWLINE [
], FUNC [function], VARIABLE [@g], NEWLINE [
], FUNC [function], VARIABLE [@h], NEWLINE [
], PRINT [print], STRING_LITERAL ["inside function h()"], NEWLINE [
], VARIABLE [@v], ASSIGN [=], INTEGER_LITERAL [10], NEWLINE [
], VARIABLE [@x], ASSIGN [=], INTEGER_LITERAL [20], NEWLINE [
], END [end], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["inside function g()"], NEWLINE [
], VARIABLE [@v], ASSIGN [=], INTEGER_LITERAL [1], NEWLINE [
], PRINT [print], STRING_LITERAL ["v = "], VARIABLE [@v], NEWLINE [
], VARIABLE [@h], NEWLINE [
], END [end], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["Welcome to my program demo"], NEWLINE [
], VARIABLE [@a], ASSIGN [=], INTEGER_LITERAL [10], NEWLINE [
], PRINT [print], STRING_LITERAL ["set a to 10 = "], VARIABLE [@a], NEWLINE [
], NEWLINE [
], VARIABLE [@a], ADD_ASSIGN [+=], INTEGER_LITERAL [2], NEWLINE [
], PRINT [print], STRING_LITERAL ["add 2 to a = "], VARIABLE [@a], NEWLINE [
], NEWLINE [
], VARIABLE [@a], ADD_ASSIGN [+=], VARIABLE [@a], NEWLINE [
], PRINT [print], STRING_LITERAL ["a = "], VARIABLE [@a], NEWLINE [
], NEWLINE [
], VARIABLE [@a], SUB_ASSIGN [-=], INTEGER_LITERAL [4], NEWLINE [
], PRINT [print], STRING_LITERAL ["a = "], VARIABLE [@a], NEWLINE [
], NEWLINE [
], VARIABLE [@z], ASSIGN [=], INTEGER_LITERAL [33], NEWLINE [
], PRINT [print], STRING_LITERAL ["z = "], VARIABLE [@z], NEWLINE [
], NEWLINE [
], VARIABLE [@z], SUB_ASSIGN [-=], VARIABLE [@a], NEWLINE [
], PRINT [print], STRING_LITERAL ["subtract a from z = "], VARIABLE [@z], NEWLINE [
], NEWLINE [
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
], VARIABLE [@c], ASSIGN [=], INTEGER_LITERAL [100000], NEWLINE [
], PRINT [print], STRING_LITERAL ["c = "], VARIABLE [@c], NEWLINE [
], NEWLINE [
], PRINT [print], STRING_LITERAL ["before function test"], NEWLINE [
], VARIABLE [@f], INTEGER_LITERAL [10], STRING_LITERAL ["2nd param"], NEWLINE [
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
], VARIABLE [@fb], ADD_ASSIGN [+=], VARIABLE [@bar], NEWLINE [
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
], NEWLINE [
], PRINT [print], STRING_LITERAL ["Tokens:"], NEWLINE [
], TOKENS [tokens], NEWLINE [
], END [end], NEWLINE [
], null [<EOF>], 
 
```
