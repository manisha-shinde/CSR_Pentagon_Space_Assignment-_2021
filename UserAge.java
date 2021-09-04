Q No.03
import java.util.Scanner;
class UserAge 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age");
		int age=scan.nextInt();
		if(age<18)
		System.out.println("Minors who are not eligible to work");
		else if((age<60) && (age>18))
			System.out.println("Eligible to work");
		else
			System.out.println("to old to work as per government regulation");

		
	}
}
