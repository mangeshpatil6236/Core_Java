import java.util.Scanner;
public class MaxMinNum{
	public static void main(String[] args){

		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Three Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a > b)
			b = a;
		if(c > a)
			b = c;
		System.out.println(b+" is Maximum Number");

		if(a < b)
			b = a;
		if(c < a)
			b = c;
		System.out.println(b+" is Minimum Number");
	}
}