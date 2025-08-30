import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){

		int n, cnt=0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		n = sc.nextInt();

		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
				cnt++;
		}

		if(cnt == 0)
			System.out.println(n+" is Prime Number");
		else
			System.out.println(n+" is NOT Prime Number");	
	}
}