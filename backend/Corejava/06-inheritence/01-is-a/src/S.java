class O 
{
	O()
	{ 
		System.out.println("O()");
	}
}
class P extends O
{
	P()
	{
		System.out.println("P()");
	}
}
class Q extends P
{
	Q()
	{
		System.out.println("Q()");
	}
}
class R extends Q
{
	R()
	{
		System.out.println("R()");
	}
}
class S extends R
{
	S()
	{
		System.out.println("S()");
	}

	public static void main(String[] args) 
	{
		O o1 = new O();
		System.out.println("_______________");
		P p1 = new P();
		System.out.println("_______________");
		Q q1 = new Q();
		System.out.println("_______________");
		R r1 = new R();
		System.out.println("_______________");
		S s1 = new S();
		System.out.println("_______________");
	}
}
/*
O()
_______________
O()
P()
_______________
O()
P()
Q()
_______________
O()
P()
Q()
R()
_______________
O()
P()
Q()
R()
S()
_______________

one constructor is calling another constructor is refered to as `constructor chaining`.
*/
