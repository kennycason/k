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

	print "Memory Dump:"
	dump
end