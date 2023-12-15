class II 
{
	static int i;
	static void test()
	{
		System.out.println("from test 1:" + II.i);
		II.i = 10;
	System.out.println("from test end: " + II.i);
	}

	public static void main(String[] args) 
	{
		System.out.println("From test 2:" + II.i);
		II.i = 5;
		II.test();
			System.out.println("from test 2 end:" + II.i);
	}
}
