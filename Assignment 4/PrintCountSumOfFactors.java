import java.util.Scanner;
public class PrintCountSumOfFactors{
	public static void main(String[] args){
		
		int n, sum = 0, cnt = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		n = sc.nextInt();
		
		System.out.print(n+" of Factors is : ");

		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.print(" "+i);
				cnt++;
				sum += i;
			}
		}
		System.out.println();
		System.out.println(n+" number of Factors of Count is : "+cnt);
		System.out.println("Sum of Factors : "+sum);
	}
}