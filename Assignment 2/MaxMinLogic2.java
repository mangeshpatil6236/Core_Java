import java.util.Scanner;
public class MaxMinLogic2{
	public static void main(String[] args){

		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Three Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a>=b && a>c)
			System.out.println(a+" is Maximum Number");
		else if(b>a && b>c)
			System.out.println(b+" is Maximum Number");
		else
			System.out.println(c+" is Maximum Number");

		if(a<=b && a<c)
			System.out.println(a+" is Maximum Number");
		else if(b<a && b<c)
			System.out.println(b+" is Maximum Number");
		else
			System.out.println(c+" is Maximum Number");
	}
}