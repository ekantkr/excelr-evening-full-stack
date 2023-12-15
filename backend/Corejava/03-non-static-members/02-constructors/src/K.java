class K 
{
	K(int i)
	{
		System.out.println("K(int)");
	}

	K()
	{
		System.out.println("K()");
	}

	K(int i, int j)
	{
		System.out.println("K(int, int)");
	}

	public static void main(String[] args) 
	{
		K obj1 = new K();
		K onj2 = new K(10);
		K onj3 = new K(10,20);
		System.out.println("done");
	}
}
