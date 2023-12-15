class H 
{
	H(int i)
	{
		System.out.println("H(int)");
	}

	H()
	{
		System.out.println("H(int)");
	}


	public static void main(String[] args) 
	{
		H h1 = new H();// so this case they would be choosing the rightone.
		System.out.println("done");
	}
}
