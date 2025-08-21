import java.util.Scanner;
public class SurfaceAreaVolume{
	public static void main(String[] args){
	
		float r,h;
		double surfaceArea, volume;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Raduis : ");
		r = sc.nextFloat();

		System.out.println("Enter Height : ");
		h = sc.nextFloat();


		surfaceArea = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
		volume = Math.PI * r * r * h;

		System.out.println("Surface Area is : "+surfaceArea);
		System.out.println("Volume is : "+volume);
	}
}