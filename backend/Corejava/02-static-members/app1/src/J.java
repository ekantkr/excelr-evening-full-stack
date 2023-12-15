class J 
{
	static int x = 0;

	static void test1()
	{
		System.out.println("from test begin: " + x);
		x = 10;
		System.out.println("From test end: " + x);
	}
	public static void main(String[] args) 
	{
		System.out.println("From main begin: " + x);
		test1();
		System.out.println("From main middle: " + x);
		test2();
		System.out.println("From main end: " + x);
	}
	static void test2() 
	{
		System.out.println("from test2 begin: " + x);
		x = 20;
		System.out.println("from test2 end: " + x);
	}
}
