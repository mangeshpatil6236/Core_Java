import java.util.Scanner;
public class ProfitLoss{
	public static void main(String[] args){

		int sellingPrice, costPrice, calculation;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Cost Price : ");
		costPrice = sc.nextInt();

		System.out.println("Enter Selling Price : ");
		sellingPrice = sc.nextInt();

		calculation = sellingPrice - costPrice;

		if(sellingPrice > costPrice)
		System.out.println("Profit is : "+calculation);
		else
		System.out.println("Loss is : "+calculation);
	}
}