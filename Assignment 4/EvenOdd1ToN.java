import java.util.Scanner;
public class EvenOdd1ToN{
	public static void main(String[] args){

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		System.out.println("1 to "+n+" Even Numbers : ");
		for(int i=2; i<=n; i+=2)
			System.out.println(i);

		System.out.println("1 to "+n+" Odd Numbers : ");
		for(int i=1; i<=n; i+=2)
			System.out.println(i);
	}
}