class S 
{
	int i;
	 
	 void test(S ref)
	{
		 System.out.println("from test(S): begin: " + ref.i);
		 ref.i = 20;
		  System.out.println("from test(S): end: " + ref.i);
	}

	public static void main(String[] args) 
	{
		S r1 = new S();
		System.out.println("main begin: " + r1.i);
		r1.i = 10;
		 System.out.println("before calling the test(S) method: " + r1.i);
		 r1.test(r1);
		 System.out.println("after calling the test(S) method: " + r1.i);
	}
}
/*
-change in the destination reflecting to the source ==> call be reference/pass by reference
-if you are sending the reference there is 100% of chances of object modification.
-reference => key to object
*/