begin main
    logging off     // turn logging on

    // function definitions

    function @f
        print "inside function f()"
        @p1 = param 1 
        print "param 1 = " @p1
    end

    @f "boom"       // call function f with parameter

    // all valid formats
    @x = 1
    @y = 0xff   
    @z = 0b1000111
    print "x : " @x ", y : " @y " z : " @z

	@x = @y
    @x -= 10
    print @x
    print "Memory Dump"
	dump
	delete @x @y @z
	dump
end