import java.util.Scanner;
public class CheckNumDivisibleBy5And7{
	public static void main(String[] args){

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num = sc.nextInt();

		if(num%5==0 && num%7==0)
			System.out.println(num+" is Divisible by 5 and 7");
		else
			System.out.println(num+" is NOT Divisible by 5 and 7");
	}
}