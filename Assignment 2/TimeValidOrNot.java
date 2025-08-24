import java.util.Scanner;
public class TimeValidOrNot{
	public static void main(String[] args){

		int hr, min, sec;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Hours : ");
		hr = sc.nextInt();

		System.out.println("Enter Minutes : ");
		min = sc.nextInt();

		System.out.println("Enter Seconds : ");
		sec = sc.nextInt();

		if(hr > 0 && hr <= 24)
		{
			if(min > 0 && min <= 60)
			{
				if(sec > 0 && sec <= 60)
					System.out.println("Entered Time is Valid");
				else
					System.out.println("Invalid Seconds");
			}
			else
				System.out.println("Invalid Minutes");
		}else
			System.out.println("Invalid Hours");
	}
}