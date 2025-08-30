import java.util.Scanner;
public class EvenOddXtoY{
	public static void main(String[] args){

		int x,y;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Range to Print Between Numbers : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(int i=x; i<=y; i++)
		{
			if(i%2==0)
				System.out.println("Even Number : "+i);
			else
				System.out.println("Odd Number : "+i);

		}
	}
}