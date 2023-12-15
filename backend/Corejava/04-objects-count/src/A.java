class A 
{
	static int x;//static member can be using anywhere in the class.its also global.

	A()
	{
		x += 10;//x = x + 10
	}

	{
		x += 20;
	}

	void test1()
	{
		x += 40;
	}

	static void test2()
	{
		x += 40;
	}

	public static void main(String[] args) 
	{
		System.out.println("A:" + x);
		A a1 = new A();
		System.out.println("B:" + x);
		a1.test1();
		System.out.println("C:" + x);
		a1.test2();
		System.out.println("D: " + x);
	}
}
