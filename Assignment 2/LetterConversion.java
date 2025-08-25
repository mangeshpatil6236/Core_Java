import java.util.Scanner;
public class LetterConversion{
	public static void main(String[] args){

		char ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Letter (Uppercase or Lowercase) : ");
		ch = sc.next().charAt(0);

		char temp = ch;

		if(ch >= 'a' && ch <= 'z')
		{
			ch = (char) ((int)ch - 32);
			System.out.println("Uppercase Converion of "+temp+" is : "+ch);
		}
		else if(ch >= 'A' && ch <= 'Z')
		{
			ch = (char) ((int)ch + 32);
			System.out.println("Lowercase Converion of "+temp+" is : "+ch);
		}
		else
			System.out.println(temp+" is NOT Alphabet");
	}
} 