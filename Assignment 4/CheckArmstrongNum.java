import java.util.Scanner;
public class CheckArmstrongNum{
	public static void main(String[] args){

		int n, cnt = 0; 
		int temp;
		double arm = 0;
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		n = sc.nextInt();

		temp = n;
	
		while(n>0)
		{
			n /= 10;
			cnt++;
		}
		
		n = temp;

		while(n>0)
		{
			int rem = n % 10;
			arm += Math.pow(rem, cnt);
			n /= 10; 
		}

		if(arm == temp)
			System.out.println(temp+" is Armstrong Number");
		else
			System.out.println(temp+" is NOT Armstrong Number");	
	}
}	

	