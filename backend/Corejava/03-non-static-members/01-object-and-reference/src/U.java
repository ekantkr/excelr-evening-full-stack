class U 
{
	int i;

	static U test()
	{
	    return new U(10);//
	}

	public static void main(String[] args) 
	{
		U obj = test ();
		System.out.println("main end : " + obj.i);
	}
}
