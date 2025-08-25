import java.util.Scanner;
public class CharAscii{
	public static void main(String[] args){

		char ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character to Display its ASCII Value : ");
		ch = sc.next().charAt(0);

		System.out.println("ASCII Value of "+ch+" is : " +(int)ch );
	}
}