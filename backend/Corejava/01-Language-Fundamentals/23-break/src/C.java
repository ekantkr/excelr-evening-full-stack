class C 
{
	public static void main(String[] args) 
	{
		int i;
		for(i = 0; i < 10; i++)
		{
			System.out.println("loop begin" + i);
			if(i > 5)
			{
				break;
				System.out.println("some statements");
		}
		System.out.println("loop end" + i);
		}
		System.out.println("main end" + i);
	}
}//break statement should be last option in the intration other wise itll show error
//system.out.print("-------------");
//break;( its true way to excute.