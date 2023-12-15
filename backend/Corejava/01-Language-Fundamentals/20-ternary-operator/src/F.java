class F 
{
	public static void main(String[] args) 
	{
		int firstNum = 50;
		int secondNum = 0;
		int thirdNum = 10;
		if (firstNum < secondNum && firstNum < thirdNum)
		{
			System.out.println("among firstNum, secondNum, thirdNum: " + firstNum + " is minimum");
		}
		else if (secondNum  < thirdNum)
		{
			System.out.println("among firstNum, secondNum, thridNum: " + secondNum + " is Minimun");
		}
		else
		{
		System.out.println("among firstNum, secondNum, thridNum: " + thirdNum + " is Minimun");
		}
	}
}
