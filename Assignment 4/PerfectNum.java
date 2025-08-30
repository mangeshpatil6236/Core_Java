import java.util.Scanner;
public class PerfectNum{
	public static void main(String[] args){

		int n, sum = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		n = sc.nextInt();

		for(int i=1; i<= n/2; i++)
		{
			if(n%i==0)
				sum += i;
		}

		if(n == sum)
			System.out.println(n+" is Perfect Number");
		else
			System.out.println(n+" is NOT Perfect Number");
	}
}