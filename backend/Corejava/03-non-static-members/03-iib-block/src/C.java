class C 
{
	static
	{
		System.out.println("C-SIB1");
	}

	{ 
		System.out.println("C-IIB1");
	}

	C()
	{
	
		System.out.println(" C()");
	}

	C(int i)
	{
		this(10, 20);
		System.out.println(" C(int)");
	}


	public static void main(String[] args) 
	{
		C b1 = new C();
		System.out.println("__________");
		C b2 = new C(90);
		System.out.println("__________");
		C b2 = new C(90);
		System.out.println("__________");
		System.out.println("__________");

	}
	{    //IIC
		System.out.println("C-IIC2");
	}
}
