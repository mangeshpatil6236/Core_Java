import java.util.Scanner;
public class HelloNTimes{
	public static void main(String[] args){

		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		n = sc.nextInt();

		for(int i=0; i<n; i++)
			System.out.println("Hello");
	}
}