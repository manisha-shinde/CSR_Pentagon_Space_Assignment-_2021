import java.util.Scanner;
class Bonus  
{
	public static void main(String[] args) 
	{
		double salary=0,bonus=0;
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Salary");
		salary=scan.nextFloat();
		System.out.println("Enter Year");
		year=scan.nextInt();
		if(year>5)
			bonus=bonus+(salary*5/100)+salary;
		System.out.println("Net Bonus Amt is="+bonus);
	
	}
}
