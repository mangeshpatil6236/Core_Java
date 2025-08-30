import java.util.Scanner;
public class PalindromeNumber{
	public static void main(String[] args){

		int n, rev = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");	
		n = sc.nextInt();

		int temp = n;

		while(n>0)
		{
			int rem = n%10;
			rev = rev * 10 + rem;
			n /= 10;
		}
	
		if(rev == temp)
			System.out.println(temp+" is Palindrome Number");
		else
			System.out.println(temp+" is NOT Palindrome Number");
	}
}