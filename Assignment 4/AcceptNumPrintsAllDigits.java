import java.util.Scanner;
public class  AcceptNumPrintsAllDigits{
	public static void main(String[] args){

		int x, n, i=1, result = 1;
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x value : ");
		x = sc.nextInt();

		System.out.println("Enter n value : ");
		n = sc.nextInt();

		while(i<=n)
		{
			result *= x;
			i++;
 		}

		System.out.println(x+"^"+n+" : "+result);
	}
}