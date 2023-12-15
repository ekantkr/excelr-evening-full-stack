class C 
{
	int counter;//its a non-static int so , by the calling the constructor they would be differnt copy of each object

	C()
	{
		counter++;
	}

	public static void main(String[] args) 
	{
		C obj1 = new C();
		System.out.println("A____________" + obj1.counter);
		C obj2 = new C();
		System.out.println("B____________" + obj2.counter);
		C obj3 = new C();
		System.out.println("C____________" + obj3.counter);
		C obj4 = new C();
		System.out.println("D____________" + obj4.counter);
		C obj5 = new C();
		System.out.println("E____________" + obj5.counter);
		
	}
}
