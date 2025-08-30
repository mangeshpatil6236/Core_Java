import java.util.Scanner;
public class CountEvenOddZeroDigits{
	public static void main(String[] args){

		int n, rem, cntE = 0, cntO = 0, cntZ = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		n = sc.nextInt();

		if(n == 0)
			cntZ = 1;

		int temp = n;

		while(n > 0)
		{
			rem = n % 10;

			if(rem == 0)
				cntZ++;
			
			else if(n % 2 == 0)
				cntE++;

			else 
				cntO++;

			n /= 10;
		}
		
		n = temp;

		System.out.println("Count of Even Digits in "+temp+" is : "+cntE);
		System.out.println("Count of Odd Digits in "+temp+" is : "+cntO);
		System.out.println("Count of Zero Digits in "+temp+" is : "+cntZ);
	}
}