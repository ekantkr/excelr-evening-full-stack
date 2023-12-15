class R
{
	static int i++;
	static int j++;//by decrement its self..we get error.

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
