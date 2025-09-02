import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Start : ");
		int x = sc.nextInt();

		System.out.println("Enter End : ");
		int y = sc.nextInt();

		for(int i=1; i<=10; i++)
		{
			for(int j=x; j<=y; j++)
			{
				System.out.print(j+" X " +i+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
	}
}