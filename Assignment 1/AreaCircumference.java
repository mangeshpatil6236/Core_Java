import java.util.Scanner;
public class AreaCircumference{
	public static void main(String[] args){

		float r;
		double area,circumference;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Raduis : ");
		r = sc.nextFloat();

		area = Math.PI * r * r;
		circumference = 2 * Math.PI * r;	

		System.out.println("Area of Circle : "+area);
		System.out.println("Circumference of Circle : "+circumference);	
	}
}