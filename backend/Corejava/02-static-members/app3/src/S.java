class S 
{
	static 
	{
		i = 10;
	}

	static int i = 20;//modification i value.

	static 
	{
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
		System.out.println(i);
	}

	static 
	{
		i = 30;
	}
}
