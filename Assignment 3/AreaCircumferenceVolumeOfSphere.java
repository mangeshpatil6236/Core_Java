import java.util.Scanner;
public class AreaCircumferenceVolumeOfSphere{
	public static void main(String[] args){

		int ch, r;
		double result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Raduis : ");
		r = sc.nextInt();

		System.out.println("""
			1. Area of Circle
			2. Circumference of Circle
			3. Volume of Sphere
			""");

		System.out.println("Choose Option");
		ch = sc.nextInt();

		switch(ch)
		{
			case 1->
			{	
				result = Math.PI * r * r ;
				System.out.println("Area of Circle is : "+result);
			}

			case 2->
			{	
				result = 2 * Math.PI * r;
				System.out.println("Circumference of Circle is : "+result);
			}

			case 3->
			{	
				result = (4 / 3) * Math.PI * r * r * r;
				System.out.println("Volume of Spehere is : "+result);
			}

			default->
			{
				System.out.println("Choose Right Option");
			}
		}
	}
}