import java.util.Scanner;
public class EmployeeSalaryTax{
	public static void main(String[] args){

		int basicSalary;
		float tax = 0;
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Basic Salary : ");
		basicSalary = sc.nextInt();

		if(basicSalary <= 150000)
			System.out.println("Employee dont have any Tax");
		else if(basicSalary > 150000 && basicSalary < 300000)
			{
				tax = (basicSalary * 20)/100;
				System.out.println("Tax is : "+tax);
			}
		else if(basicSalary > 300000)
			{
				tax = (basicSalary * 30)/100;
				System.out.println("Tax is : "+tax);
			}
	}
}
			