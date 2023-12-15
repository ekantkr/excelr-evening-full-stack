class A 
{
	A()
	{
		System.out.println("A()");
	}
	{
		System.out.println("A-IIB-1");//for each all IIB block gets execute before the execution of the A().
	}

	A(int i)
	{
		System.out.println("A(int)");
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("____________");
		A a2 = new A(10);
		System.out.println("____________");
	}
	{
		System.out.println("A-IIB-2");
	}
}
/*
A-IIB-1
A-IIB-2
A()
____________
A-IIB-1
A-IIB-2
A(int)
____________
*/