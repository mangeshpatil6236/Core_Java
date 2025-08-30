import java.util.Scanner;
public class SumOf1ToNEVenNum{
	public static void main(String[] args){

		int sumE=0, sumO=0, n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();
	
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
				sumE += i;
			else
				sumO += i;
		}

		System.out.println("Sum Of 1 to "+n+" Even Numbers : "+sumE);
		System.out.println("Sum Of 1 to "+n+" Odd Numbers : "+sumO);
	}
}