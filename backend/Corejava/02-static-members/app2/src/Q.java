class O 
{
	public static void main(String[] args)
	{
	  System.out.println("helloworld! from O begin");
	  P.main(null);
	 System.out.println("helloworld! from O end");
	}
}

class P
{
	public static void main(String[] args) 
	{
		System.out.println("helloworld! from P begin");
		Q.main(null);
		System.out.println("helloworld! from P end");
	}
	}

	class Q
{
	public static void main(String[] args) 
	{
		System.out.println("helloworld! from Q");
	}
}
