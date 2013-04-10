begin name
	print "Welcome to my program demo"
	@a = 10 	// base 10
	print @a
	@a = 0xff 	// base 16
	print @a
	@a++
	print @a
	@a -= 20
	print @a
	logging on		// turn logging on
	@b = @a
	print @b
	logging off		// turn logging off
	@b++
	print @b
	dump
end