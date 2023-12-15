import java.util.Scanner;
class Facebook  
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Facebook! Please Register");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your First Name");
		String FirstName = sc.next();

		System.out.println("Enter Your Sur Name");
		String SurName = sc.next();

		System.out.println("Enter Your Mobile Number");
		long MobileNumber = sc.nextLong();

		System.out.println("Enter Your Email ID");
		 String EmailId= sc.next();

		 System.out.println("Enter Your New Password");
		 String NewPassword= sc.next();

		 System.out.println("Enter Your DOB");
		 String DateofBirth= sc.next();

		 System.out.println("Enter Your Gender");
		 String Gender= sc.next();

		 System.out.println("Enter Your Salary");
		 double Salary= sc.nextDouble();

		 System.out.println("Enter Your First Initials");
		 String FirstInitials= sc.next();

		 System.out.println("Enter Your Favorite quote");
		 sc.nextLine();
		 String quote = sc.nextLine();

		 System.out.println("Are you Alive?");
		 boolean status = sc.nextBoolean();

		 System.out.println("\n____________________________________\nYour details are listen below\n"
		 + "First Name: " + FirstName + "\n" 
			 + "Sur Name: " + SurName + "\n"
			 + "Mobile Number:" + MobileNumber + "\n"
			 + "Email Id:" + EmailId + "\n"
				 + "New Password:" + NewPassword + "\n"
					 + "DOB:" + DateofBirth + "\n"
						 + "Salary:" + Salary + "\n"
							 + "First Inititials:" + FirstInitials + "\n"
								 + "qoute:" + quote + "\n"
									 + "Are you Alive?:" + status);

									 sc.close();
	}
}
