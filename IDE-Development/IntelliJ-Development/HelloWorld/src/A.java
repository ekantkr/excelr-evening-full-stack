public class A
{
    static int count;
    A()
    {
        count++;
    }
    public static void main(String[] args)
    {
        A a1 = new A();
        System.out.println("A: " + count);
        A a2 = new A();
        System.out.println("B: " + count);
        A a3 = new A();
        System.out.println("C: " + count);
        A a4 = new A();
        System.out.println("C: " + count);

    }
}