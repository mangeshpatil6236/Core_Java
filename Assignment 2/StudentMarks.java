import java.util.Scanner;
public class StudentMarks{
	public static void main(String[] args){

		int m1, m2, m3, total;
		float avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks of Three Subject : ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();

		total = m1 + m2 + m3;
		System.out.println("Total Marks is : "+total);

		avg = total / 3;
		System.out.println("Percentage is : "+avg);

		if(avg >= 90)
			System.out.println("Class - I");
		else if (avg >= 80 || avg <= 90)
			System.out.println("Class - II");
		else if (avg >= 70 || avg <= 80)
			System.out.println("Pass Class");
		else
			System.out.println("Fail");
	}
}