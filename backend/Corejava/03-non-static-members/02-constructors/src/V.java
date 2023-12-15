class V 
{
	V()
	{
		V obj1 = new V(10);	
		System.out.println("v()");
	} 

	V(int i)
	{
		V obj2 = new V(10, 20);
		System.out.println("v(int)");
	} 

	V(int i, int j, int k)
	{
		System.out.println("V(int, int, int)");
	}

	public static void main(String[] args)
	{
		V v1 = new V();
		System.out.println("_____________");
		V v2 = new V(100);
		System.out.println("_____________");
		V v3 = new V(100, 200);
		System.out.println("_____________");
		V v4 = new V(100, 200, 300);
		System.out.println("_done_");
	}
}
