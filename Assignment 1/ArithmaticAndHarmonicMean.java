//Accept two numbers and print arithmetic and harmonic mean of the two numbers. (Hint: AM=(a+b)/2, HM = ab/(a+b)) 

import java.util.Scanner;
public class ArithmaticAndHarmonicMean{
	public static void main(String[] args){
		
		int a,b;
		float AM, HM;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();

		AM = (a + b) / 2;
		HM = a * b * (a + b);

		System.out.println("Arithmatic Mean : "+AM);
		System.out.println("Harmoni Mean : "+HM);
	}
}