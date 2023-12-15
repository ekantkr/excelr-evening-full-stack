class B 
{
	B()
	{
		System.out.println("B()");
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
	}
}
/*
1. If at least one constructor kept by the user then compiler 
   will not be keeping default constructor.

2. Constructor name should be same as class name.

3. Constructor can't have a return type.

4. Constructor not a normal methods but internally they are
   speacial kind of methods.

5. Constructor is a non-static and part of the object.

6. Constructor are used to initialize the objects.

7. Constructor can take any no. of arguments.

8. Constructor must be having a body.

9. we can develop any no. of vaild statment inside the constructor body.

10. In one class we can develop any no. of constructors but arguments must be differents.
*/
