class U 
{
	U()
	{
		this();//this constructor calling itself #error.
		System.out.println("U()");
	}
}
