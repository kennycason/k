begin
	logging on		// turn logging on, should be on by default
	
	// function definitions
	 
	function f
		print "inside function f()"
		p1 = param 1 
		p2 = param 2
		print "param 1 = " p1
		print "param 2 = " p2
	end
	
	function g
		function h
			print "inside function h()"
			v = 10
			x = 20
		end
	
		print "inside function g()"
		v = 1
		print "v = " v
		h
	end
	
	print "Welcome to my program demo"
	a = 10 	// base 10
	print "set a to 10 = " a
	
	d + p
	
	print "begin assign test"
	a + 2
	print "add 2 to a = " a
	
	a + a
	print "a = " a
	print "end assign test"

	a -= 4
	print "a = " a
	
	z = 33
	print "z = " z
	
	z - a
	print "subtract a from z = " z
	
	z * 3
	print "multiply 3 and z = " z

	z / 3.14
	print "divide z by 3.14 = " z
	
	a = 0xff 	// base 16
	print "a = " a
	
	a++
	print "increment a = " a
	
	b = 0b1000
	print "b = " b
	
	b--
	print "decrement b = " b
	
	c = 100000
	print "c = " c
	
	e = 7
    e ^ 13
	print "7 ^ 13 = " e
	
    e = 10
    e % 8
	print "10 % 8 = " e
	
	print "before function test"
	f 10 "2nd param"
	g
	print "after function test"
	
	print "pass by value test"
	b = c	
	print "b = " b
	print "c = " c
	b++
	print "b = " b
	print "c = " c

	print "concat strings and vars test"
	foo = "foo"
	bar = "bar"
	print "f = " foo
	print "b = " bar
	fb = foo
	fb + bar
	print "f = " foo
	print "b = " bar
	print "fb = " fb
	
	logging on 
	y = 0b1010011
	logging off

	print "Memory Dump:"
	dump
	print "Delete everything except function f"
	delete a b c y fb foo bar p g d z e
	dump
	
	print "Tokens:"
	tokens
end