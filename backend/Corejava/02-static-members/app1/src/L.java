class L 
{
	static int x = 100;

	public static void main(String[] args) 
	{
		System.out.println(x);
		int x = 10;
		System.out.println(x);
		System.out.println(L.x);//using the class reference.
		x = 20;
		System.out.println(x);
		System.out.println(L.x);
		L.x = 200;
		System.out.println(x);
		System.out.println(L.x);
	}
}
