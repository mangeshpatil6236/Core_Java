import java.util.Scanner;
public class DisplayDigitIntoWords{
	public static void main(String[] args){

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		num = sc.nextInt();

		switch(num)
		{
			case 0->
				System.out.println("Zero");
			
			case 1->
				System.out.println("One");
		
			case 2->
				System.out.println("Two");

			case 3->
				System.out.println("Three");

			case 4->
				System.out.println("Four");

			case 5->
				System.out.println("Five");

			case 6->
				System.out.println("Six");

			case 7->
				System.out.println("Seven");

			case 8->
				System.out.println("Eight");

			case 9->
				System.out.println("Nine");

			default->
				System.out.println("Enter Single Digit Number");


		}
	}
}