class Q
{
	static 
	{
		System.out.println(i);//its come under a usage before declaration ..so is not possible.
	}

	static int i = 10;

	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
