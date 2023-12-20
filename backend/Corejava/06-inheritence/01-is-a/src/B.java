class A // Super class
{
	int i;
}
class B extends A // B is a child class
{
	int j;

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
/*
basic pillars of objects oriented programming language
1. Inheritence--
2. abstraction
3. Encapsulation 
4. Polymorphism

[Inheritence]--

-Aquiring the properties and behaviours of another class.(super class)

-A class can inherit properties(variables) and behaviours(methods) from another class.

-BASE class == PARENT class == SUPER class
DERIVED class == CHILD class == SUB class

-we ca  achieve inheritence using extends keyword in case of classes.

-In case of extends the indication would be a solid line towards pointing to super type.

-we can inherite non-static variables

- we can inherite non-static methods

-we can inherite static variables



-There are 5 types of Inheritence:-
_____________________________________
1. Single Inheritence
2. Multi-level Inheritence
3. Multiple Inheritence
4. Hierarchical Inheritence
5. Hybrid Inheritence

-The main use of Inheritence is code re-usability.

question
can we inherite main method also?
---------------------------------------
yes, main method also inherits to the sub-class but:

1. if the sub-class is having its own main methods, then if the main method from the
   sub-class main method only.

2. if the sub-class doesn't have its own main methods, then if we call the main method from
   the sub-class it will be always calling the super-class main method only.
*/