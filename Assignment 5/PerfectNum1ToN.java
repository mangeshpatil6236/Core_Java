import java.util.Scanner;
public class PerfectNum1ToN{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number (Range) : ");
		int y = sc.nextInt();

		System.out.println("Perfect numbers from 1 to " + y + " are:");

		for(int i=1; i<=y; i++)
		{
			int sum = 0;

			for(int j=1; j<=i/2; j++)
			{
				if(i % j == 0)
					sum += j;
			}
			if(sum == i)
				System.out.println(i+" ");
		}
	}
}
		