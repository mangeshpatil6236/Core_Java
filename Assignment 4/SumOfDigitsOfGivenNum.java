import java.util.Scanner;
public class  SumOfDigitsOfGivenNum{
	public static void main(String[] args){

		int n, sum = 0, rem;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		int temp = n;

		while(n>0)
		{
			rem = n % 10;
			sum += rem;
			n /= 10;
		}

		n = temp;
		
		System.out.println("Sum of "+temp+" number of Digits is : "+sum);

	}
}