import java.util.Scanner;
public class DistanceBtnXYCordinates{
	public static void main(String[] args){

		float x1, y1, x2, y2;
		double dist;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x1 and y1 Cordinates : ");
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();

		System.out.println("Enter x2 and y2 Cordinates : ");
		x2 = sc.nextFloat();
		y2 = sc.nextFloat();

		dist = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		System.out.println("Distance Between Two Points : "+dist);
	}
}