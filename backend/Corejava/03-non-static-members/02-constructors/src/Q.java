class Q 
{
	Q()
	{
		this(10);
		System.out.println("Q()");
	}

	Q(int i)
	{
		this(true);
		System.out.println("Q(int)");
	}

	Q(boolean i)
	{
		this(10, 20);
		System.out.println("Q(boolean)");
	}

	Q(int i, int j)
	{
		this(i, j, 30);
		System.out.println("Q(int, int)");
	}

	Q(int i, int j, int k)
	{
		System.out.println("Q(int, int, int)");
	}

	public static void main(String[] args) 
	{
		Q obj1 = new Q();
		System.out.println("____________");
		Q onj2 = new Q(10);
		System.out.println("____________");
		Q onj3 = new Q(false);
		System.out.println("____________");
		Q onj4 = new Q(100, 200);
		System.out.println("____________");
		Q onj5 = new Q(400, 600, 800);
		System.out.println("____________");
		System.out.println("done");
	}
}
