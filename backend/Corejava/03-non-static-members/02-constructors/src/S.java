class S 
{
	S()
	{
		S(10);// there would be error becoz we can use only this.
		System.out.println("S()");
		
	} 

	S(int i)
	{
		System.out.println("S(int)");
	} 
	
}
