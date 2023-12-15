class D 
{
	void test1()
	{
		System.out.println("test1()");
	}

	 static void test2()
	{
		 test1();//non-static member they can't reference by static members. they'll shwn error.
		System.out.println("test2()");
	}
}
