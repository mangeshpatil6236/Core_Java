import java.util.Scanner;
public class ItemDiscount{
	public static void main(String[] args){
		
		int item1, item2, item3, totalAmt;
		float dCount;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Amounts of Three Marks : ");
		item1 = sc.nextInt();
		item2 = sc.nextInt();
		item3 = sc.nextInt();

		totalAmt = item1 + item2 + item3;
		System.out.println("Total Amount is : "+totalAmt);

		if(totalAmt >= 300000)
		{
			dCount = (totalAmt * 20) / 100;
			System.out.println("Discount is : "+dCount);
		}
		else if(totalAmt < 300000 && totalAmt >= 150000) 
		{
			dCount = (totalAmt * 15) / 100;
			System.out.println("Discount is : "+dCount);
		}
		else if(totalAmt < 150000 && totalAmt >= 50000) 
		{
			dCount = (totalAmt * 10) / 100;
			System.out.println("Discount is : "+dCount);
		}
		else 
			System.out.println("You Don't Have Any Discount");
	}
}