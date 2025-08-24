import java.util.Scanner;
public class LibraryCharges{
	public static void main(String[] args){

		int days, fine;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of Days : ");
		days = sc.nextInt();

		if(days <= 5)
		{
			System.out.println("Your Fine Per Day is 25 Rs ");
			fine = 25 * days;
			System.out.println("Fine is : "+fine);
		}
		else if(days > 5 && days < 10)
		{
			System.out.println("Your Fine Per Day is 50");
			fine = 50 * days;
			System.out.println("Fine is : "+fine);
		}
		else if(days >= 10)
		{
			System.out.println("Your Fine Per Day is 100");
			fine = 100 * days;
			System.out.println("Fine is : "+fine);
		}
	}
}