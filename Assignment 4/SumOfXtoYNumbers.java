import java.util.Scanner;
public class SumOfXtoYNumbers{
	public static void main(String[] args){

		int x, y, sum=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numbers to Sum Between Numbers : ");
		x = sc.nextInt();
		y = sc.nextInt();

		for(int i=x; i<=y; i++)
			sum += i;
		System.out.println("Sum of "+x+" to "+y+" Numbers : "+sum);
	}
}