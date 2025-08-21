import java.util.Scanner;
public class CurrencyNotes{
	public static void main(String[] args){

		int amount, ten, five, one;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Amount : ");
		amount = sc.nextInt();

		ten = amount / 10;
		amount = amount % 10;

		five = amount / 5;
		amount = amount % 5;

		one = amount;

		System.out.println("Notes of Ten : "+ten);
		System.out.println("Notes of Five : "+five);
		System.out.println("Notes of One : "+one);
	}
}