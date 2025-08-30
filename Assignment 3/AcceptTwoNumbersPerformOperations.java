import java.util.Scanner;
public class AcceptTwoNumbersPerformOperations{
	public static void main(String[] args){

		int x, y, ch;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Two Numbers : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("""
			1. Equality
			2. Less Than
			3. Quatient and Reminder
			4. Range
			5. Swap
			""");

		System.out.println("Choose Operation");
		ch = sc.nextInt();

		switch(ch)
		{
			case 1->
			{
				if(x==y)
					System.out.println(x+" is Equal to "+y);
				else
					System.out.println(x+" is NOT Equal to "+y);
			}
		
			case 2->
			{	
				if(x>y)
					System.out.println(x+" is Greater than "+y);
				else
					System.out.println(x+" is Less than "+y);
			}

			case 3->
			{
				System.out.println("Divide first value by second value and quotient is : "+(x / y));
				System.out.println("Divide first value by second value and  Remainder is : "+(x % y));
			}

			case 4->
			{
				System.out.println("Range");
			}

			case 5->
			{
				System.out.println("Before Swapping : x = "+x+" Before Swapping y = "+y);
				x = x + y - (y = x);
				System.out.println("After Swapping : x = "+x+" After Swapping y = "+y);
			}
		}
	}
}