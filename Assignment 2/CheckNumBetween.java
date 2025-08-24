import java.util.Scanner;
public class CheckNumBetween{
	public static void main(String[] args){

		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Number : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if((a>b && a<c) || (a<b && a>c))
			System.out.println(a + " is between " + b + " and " + c);
		else 
			System.out.println(a + " is NOT between " + b + " and " + c);
	}
}