class A 
{
	static int i;// field, property, attribute.

	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
1. static is a keyword or reserved word.
2. we can declare a variable with static keyword.
3. statice means something that doesn't change very often.
4. static members are also called class members.


			How static members are processed?
			---------------------------------
			1. All the static members gets loaded whenever the
			   class is loading to the memory.

			2. In case of static variables they are going to be
			   loaded with their default value Ex.
			   int--> 0, float, double--> 0.0 boolean--> false,
			   string--> null etc.

			3. After all the static memebers gets loaded to the 
			   memory, the next step is that all the staic members
			   gets initialized and executed from top to bottom 
			   only once.

			4. All the static members get loaded, initialized and 
			   executed form top to bottom only once for one execution
			   when class is loading to the memory.

			5. After all the static members gets loaded, initialized and
			   executed from top to bottom control comes to the main
			   method. starts execution from the main method.

 Interview Question-->> Is there any possibiity of executing something 
                        before the execution of main method??

				Ans-->> All the static members gets loaded, initialized
				        and executed before the execution of main method.
*/