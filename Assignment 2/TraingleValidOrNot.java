import java.util.Scanner;
public class TraingleValidOrNot{
	public static void main(String[] args){

		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Sides Traingle : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if((a+b) > c && (a+c) > b && (b+c) > a)
			System.out.println("Valid Traingle");
		else
			System.out.println("NOT Valid Traingle");
	}
}