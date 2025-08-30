import java.util.Scanner;
public class ArithmaticOperations{
	public static void main(String[] args){

		int n1, n2, ch;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.println("""
			1. Addition
			2. Substraction
			3. Multiplication
			4. Division
			""");
			
		System.out.println("Choose Opearation");
		ch = sc.nextInt();

		switch(ch)
		{
			case 1->
				System.out.println("Addition is : "+(n1+n2));

			case 2->
				System.out.println("Substraction is : "+(n1-n2));

			case 3->
				System.out.println("Multiplication is : "+(n1*n2));

			case 4->
				System.out.println("Division is : "+(n1/n2));
		}
	}
}

		

		