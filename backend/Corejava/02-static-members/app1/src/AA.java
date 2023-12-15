class AA 
{
	static int i = 1;

        public static void main(String[] args) 

        {

                System.out.println("main:" + i);

                test();

                AA.test();

        }

        public static void test()

        {

                System.out.println("test:" + i);
				i = 3;

        }


}


