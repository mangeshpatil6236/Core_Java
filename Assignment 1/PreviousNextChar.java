import java.util.Scanner;
public class PreviousNextChar{
	public static void main(String[]  args){

		char ch;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any Character To show Previous and Next Character : ");
		ch = sc.next().charAt(0);

		System.out.println("Previous Character is : "+(char) (ch-1));
		System.out.println("Next Character is : "+(char) (ch+1));
	}
}