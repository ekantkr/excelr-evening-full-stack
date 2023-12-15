class  
{
	{
		System.out.println("B-IIb1");
	}

	B()
	{
		System.out.println("B()");
	}

	B(int i)
	{
		this();
		System.out.println(" B(int)");
	}


	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("__________");
		B b2 = new B(90);
		System.out.println("__________");

	}
	{
		System.out.println("B-IIB2");
	}
}
