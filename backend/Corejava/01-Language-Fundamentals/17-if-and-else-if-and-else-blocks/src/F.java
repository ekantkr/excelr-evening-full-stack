class F
{
	public static void main(String[] args) 
	{
		if (false)
		{
			System.out.println("from if");
		}
		else 
		{
			System.out.println("from last else");
		}
		else if (false)
		{
			System.out.println("from else if1 1");
		}
		else if (false)
		{
			System.out.println("from last else if 2");
		}
		else if (false)
		{
			System.out.println("from last else if 3");
		}
	}
}
//non of the else ist not true so last one (else) that get executed. in b/w only else all of us if else () they will get error, so they write of the all of else if ().