class S 
{
	int i;
	 
	 static void test(int i)//local variable is not the change main method
	{
		 System.out.println("from test(S): begin: " + i);
		 i = 20;
		  System.out.println("from test(S): end: " + i);
	}

	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println("main begin: " + s1.i);
		s1.i = 10;
		 System.out.println("before test(int): " + s1.i);
		 test(s1.i);//sending only int value not ref. so its wouldn't be change main method.
		 System.out.println("after test(int): " + s1.i);
	}
}
/*
-call by value/pass by value
-change in the destinaton would not be reflecting to the source
-because we are not sending the reference instead we are sending the value.
-value is not a key to the object (reference is a key to the object)
-we are sending onlu value not the key, so there is a 0% of object modificaton.
*/