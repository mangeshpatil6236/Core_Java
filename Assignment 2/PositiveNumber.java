import java.util.Scanner;
public class PositiveNumber{
	public static void main(String[] args){
	
		int num;
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num = sc.nextInt();

		if(num>0)
		System.out.println(num+ " is Positive Number");
	}
}