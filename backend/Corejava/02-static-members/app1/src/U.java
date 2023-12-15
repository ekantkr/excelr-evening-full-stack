class U
{
	static int i = j;// it will be show error, illegal forward reference.
	static int j;

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
