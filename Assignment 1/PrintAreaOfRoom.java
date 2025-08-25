import java.util.Scanner;
public class PrintAreaOfRoom{
	public static void main(String[] args){

		double roomArea, paintArea, roofArea, rHeight, rLength, rBreadth;
		double windowArea, wLength, wBreadth;
		double doorArea, dLength, dBreadth;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Heigth, Length and Breadth of Room (in meters): ");
		rHeight = sc.nextDouble();
		rLength = sc.nextDouble();
		rBreadth = sc.nextDouble();

		roomArea = 2 * (rBreadth + rLength) * rHeight;

		System.out.println("Enter Length and Breadth of Window (in meters): ");
		wLength = sc.nextDouble();
		wBreadth = sc.nextDouble();

		windowArea = (wLength * wBreadth) * 2;

		System.out.println("Enter Length and Breadth of Door (in meters): ");
		dLength = sc.nextDouble();
		dBreadth = sc.nextDouble();
		
		doorArea = dLength * dBreadth;

		paintArea = roomArea - (windowArea + roomArea);

		roofArea = rBreadth * rLength;

		System.out.println("Area of Painted (interior) Walls : "+paintArea);
		System.out.println("Area of whitewashed (roof : "+roofArea);
	}
}
		