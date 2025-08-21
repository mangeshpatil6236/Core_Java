import java.util.Scanner;
public class Employee{
	public static void main(String[] args){
		
		float homeSalary, da=30, hra=10, tax=5;
		int id, basicSalary;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID : ");
		id = sc.nextInt();

		System.out.println("Basic Salary : ");
		basicSalary = sc.nextInt();

		homeSalary = basicSalary + (basicSalary * (da + hra - tax) / 100);

		System.out.println("Home Salary (Total Salary) : "+homeSalary);
	}
}

		