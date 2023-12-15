class F 
{
	//counter = 0 , 10, 20, 40, 80;
	static int counter =10;

	{
		counter *= 2;//
	}

	F()
	{
		counter *= 2;// counter = counter *2;//counter = 10 * 2 ==20
	}

	F(int i)
	{
		counter *= 2;// == 20*2 = 40
	}

	F(int i, int j)
	{
		counter *= 2;// 40*2 =80
	}

	public static void main(String[] args) 
	{
		F obj1 = new F();
		F obj2 = new F(10);
		F obj3 = new F(10,20);

		System.out.println("A: " + obj1.counter);
		System.out.println("B: " + obj2.counter);
		System.out.println("C: " + obj3.counter);
	}
}
