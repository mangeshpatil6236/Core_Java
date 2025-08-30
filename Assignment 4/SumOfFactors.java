import java.util.Scanner;
public class SumOfFactors{
	public static void main(String[] args){

		int n, sum = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			if(n % i == 0)
				sum += i; 
		}

		System.out.println("Sum of Factors : "+sum);
	}
}