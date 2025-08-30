import java.util.Scanner;
public class FactorsOfGivenNum{
	public static void main(String[] args){

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		
		System.out.print("Factors of "+n+" is : ");
		for(int i=1; i<=n; i++)
		{
			if(n % i == 0)
				System.out.print(" "+i);
		}
	}
}