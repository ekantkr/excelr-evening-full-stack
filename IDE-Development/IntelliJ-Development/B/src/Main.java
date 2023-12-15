public class B
int i;

         B()

         {

                  System.out.println("B()");

                this.i = 20;

         }

         public static void main(String[] args)

     {

              System.out.println("main begin");

            B obj1 = new B();

            System.out.println("-------------");

            B obj2 = new B();

            System.out.println("-------------");

            B obj3 = new B();

            System.out.println("-------------");

            System.out.println(obj1.i + ", " + obj2.i + ", " + obj3.i);

            System.out.println("main end");

      }