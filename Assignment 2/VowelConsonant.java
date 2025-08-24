import java.util.Scanner;
public class VowelConsonant{
	public static void main(String[] args){

		char c;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Character : ");
		c = sc.next().charAt(0);

		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			System.out.println(c+" is Vowel");
		else
			System.out.println(c+" is Consonant");
	}
}