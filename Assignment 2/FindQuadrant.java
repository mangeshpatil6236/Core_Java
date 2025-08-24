import java.util.Scanner;
public class FindQuadrant{
	public static void main(String[] args){

		int x,y;
	
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter x and y Cordinate : ");
		x = sc.nextInt();
		y = sc.nextInt();

		if(x==0 && y==0)
			System.out.println("Point lies at Orign");
		else if(x>0 && y>0)
			System.out.println("Point lies at First Quadrant");
		else if(x>0 && y<0)
			System.out.println("Point lies at Second Quadrant");
		else if(x<0 && y<0)
			System.out.println("Point lies at Third Quadrant");
		else if(x<0 && y>0)
			System.out.println("Point lies at Fourth Quadrant");
		else if(x==0)
			System.out.println("Point lies on y-Axix");
		else if(y==0)
			System.out.println("Point lies on x-Axix");
	}
}