import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){

		int n, rev = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		int temp = n;

		while(n>0)
		{
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}

		System.out.println(temp+" of Reverse Number is : "+rev);
	}
}

		