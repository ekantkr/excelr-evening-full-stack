class B 
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((i++ == 0) | (i++ == 1))
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}
// in single & both must be true. it should be check another one.