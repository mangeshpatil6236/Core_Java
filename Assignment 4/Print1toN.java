import java.util.Scanner;
public class Print1toN{
	public static void main(String[] args){

		int x = 1, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		y = sc.nextInt();

		for(int i=x; i<=y; i++)
			System.out.println(i);

	}
}