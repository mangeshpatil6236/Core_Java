import java.util.Scanner;
public class Temperature{
	public static void main(String[] args){
		
		float f;
		double c, k;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Fahrenheit : ");
		f = sc.nextFloat();

		c = (5.0 / 9.0) * (f - 32);
		k =  c + 273.15;

		System.out.println("Fahrenheit : "+f);
		System.out.println("Celsius : "+c);
		System.out.println("Kelvin : "+k);
	}
}
