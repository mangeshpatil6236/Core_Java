import java.util.Scanner;
public class MaxMinNumUsingTernary{
	public static void main(String[] args){

		int a,b,c;
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Three Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		b = (a > b) ? a : b;
		b = (c > b) ? c : b;	
		System.out.println(b+" is Maximum Number");

		b = (a < b) ? a : b;
		b = (c < b) ? c : b;
		System.out.println(b+" is Minimum Number");
	}
}
	
