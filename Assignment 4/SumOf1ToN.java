import java.util.Scanner;
public class SumOf1ToN{
	public static void main(String[] args){

		int n, sum = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		n = sc.nextInt();
		
		// using loop
		for(int i = 1; i <= n; i++)
			sum += i;

		// Without using Loop
		// sum = (n * (n + 1)) / 2;

		System.out.println("Sum of 1 to "+n+" Numbers : "+sum);
	}
}