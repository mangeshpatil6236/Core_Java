import java.util.Scanner;
public class CheckNumDivisibleBy5And7UsingNestedIf{
	public static void main(String[] args){

		int num;
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num = sc.nextInt();

		if(num%5==0)
		{
			if(num%7==0)
				System.out.println(num+" is divisible by both 5 and 7");
			else 
				System.out.println(num+" is divisible by only 5 NOT 7");
		}
		else
			System.out.println(num+" is divisible by only 7 NOT 5");
	}
}