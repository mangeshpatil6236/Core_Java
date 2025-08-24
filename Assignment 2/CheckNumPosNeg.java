import java.util.Scanner;
public class CheckNumPosNeg{
	public static void main(String[] args){

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num = sc.nextInt();

		if(num>0)
			System.out.println(num+" is Positive Number");
		else
			System.out.println(num+" is Negative Number");
	}
}