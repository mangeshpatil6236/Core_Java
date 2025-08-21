//  Accept three dimensions length (l), breadth(b) and height(h) of a cuboid and print surface area and volume. (Hint: surface area=2(lb + lh +bh), volume = lbh)

import java.util.Scanner;
public class Cuboid{
	public static void main(String[] args){

		int l, b, h;
		float surfaceArea, volume;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length : ");
		l = sc.nextInt();
		System.out.println("Enter Breadth : ");
		b = sc.nextInt();
		System.out.println("Enter Height : ");
		h = sc.nextInt();	

		surfaceArea = 2 * (l*b + l*h + b*h);
		volume = l*b*h;

		System.out.println("Surface Area : "+surfaceArea);
		System.out.println("Volume : "+volume);
	}
}