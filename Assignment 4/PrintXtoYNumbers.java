import java.util.Scanner;
public class PrintXtoYNumbers{
	public static void main(String[] args){

		int x ,y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numbers to Show Between Numbers : ");
		x = sc.nextInt();
		y = sc.nextInt();

		for(int i=x; i<=y; i++)
			System.out.println(i);
	}
}