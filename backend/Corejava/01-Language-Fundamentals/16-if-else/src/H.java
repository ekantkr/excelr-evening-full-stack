class H
{
	public static void main(String[] args) 
	{
		if(true)
		{
		    System.out.println("outer-if-began");
			if(false)
			{
				System.out.println("inner if");
			}
			System.out.println("outer-if-end");
		}
	}
}
