class D 
{
	static int counter;

	D()
	{
		counter++;
	}

	public static void main(String[] args) 
	{
		D obj1 = new D();
		System.out.println("A____________" + obj1.counter);
		D obj2 = new D();
		System.out.println("B____________" + obj2.counter);
		D obj3 = new D();
		System.out.println("D____________" + obj3.counter);
		D obj4 = new D();
		System.out.println("D____________" + obj4.counter);
		D obj5 = new D();
		System.out.println("E____________" + obj5.counter);

		System.out.println("E__________________________");
		System.out.println("E____________" + obj5.counter);
		System.out.println("E____________" + obj5.counter);
		System.out.println("E____________" + obj5.counter);
		System.out.println("E____________" + obj5.counter);
		System.out.println("E____________" + obj5.counter);
		System.out.println("E____________" + obj5.counter);
		System.out.println("E____________" + obj5.counter);
		
	}
}
