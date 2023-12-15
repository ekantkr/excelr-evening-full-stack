class F
{
	static int i;

	static int test()
	{
		System.out.println("from test()");
		return 20;
	}
	
}//in java JDK <= 1.6 executing without main method
//from java JDK >= 1.7 executing a class without main method not possible
