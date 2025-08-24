import java.util.Scanner;
public class CompareTwoNumbers{
	public static void main(String[] args){

		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Numbers  : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		if(n1==n2)
			System.out.println(n1+" is Equal to "+n2);
		else if(n1>n2)
			System.out.println(n1+" is Greater than "+n2);
		else if(n1<n2)
			System.out.println(n1+" is Less than "+n2);
	}
}