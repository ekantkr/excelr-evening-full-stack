class H 
{
	public static void main(String[] args) 
	{
		int firstNum = -5;
		int secondNum = -110;
		int thirdNum = -10;
		int

		int min = (firstNum < secondNum && firstNum < thirdNum) ? firstNum : ((secondNum < thirdNum ) ? secondNum : thirdNum);

		System.out.println(min);
	}
}
