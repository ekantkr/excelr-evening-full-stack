class II 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("main begin" + i);
			if (i >= 2)
			{
				continue;
			}
				System.out.println("main middle" + i);
			if (i >= 3)
			{
				continue;
			}
              System.out.println("main end" + i);
		}
	}
}
