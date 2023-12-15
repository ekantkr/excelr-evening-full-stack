class E
{
	int i;// this i belong to class file/local i.

	E(int i)
	{
		this.i = i;//this. mean they are refering the local i.
		System.out.println("E(int)");
	}

	public static void main(String[] args) 
	{
		E e1 = new E(10);
		System.out.println("done:" + e1.i);
	}
}
// "this" is a keyword and it repesent the current abject.