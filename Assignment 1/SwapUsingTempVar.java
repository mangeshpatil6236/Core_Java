import java.util.Scanner;
public class SwapUsingTempVar{
	public static void main(String[] args){

		int a,b,c;      // c is temp variable 
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Before Swapping");
		System.out.println("A = "+a);
		System.out.println("B = "+b);

		// using + and - opearator

		//a = a + b;
     		//b = a - b;
		//c = a - b;

		// using * and / opearator
    		a = a * b;
    		b = a / b;
    		a = a / b;

		// Without using Temperory Variable
		// a = a + b - (b = a);


		System.out.println("After Swapping");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}
}