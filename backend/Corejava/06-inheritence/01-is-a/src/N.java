class M extends Object
{
	M()
	{
		//super();
		System.out.println("M()");
	}
}
class N extends M
{
	/*N()
	{
		this();//if this(); we keep here they wouldn't excute the <M.
		super();//they calling the m class by the default java.
	}*/
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("from N main");
	}
}
//M()
//from N main

/*
Super calling statement----

-in each and every constructor body as a first statement compiler only keeps `super();`

-this `Super();` is going to call the super class no-arg constructor.

-super calling statement we can keep int the construtor body as well as method body.

-According to the argument that we supply to the super, it is going to call the super call constructor.


-[there is class called object that is the inbuilt class.

-object class is the super-most in java.

-each and every class extends object class either directly or indirectly.

-for each class object is the super class either directly or indirectly.

-from the object class most important member which is required by all the classes
  would be inheriting to the sub-class.

  Example-
  -in the constructor body if we are keeping `this()` calling statement then 
   compiler will not keep `super()`.

*/
