import java.util.Scanner;
public class CountTheNumOfDigits{
	public static void main(String[] args){
		
		int n, cnt = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		
		int temp = n;
		while(n>0)
		{
			n = n/10;
			cnt++;
		}

		n = temp;

		System.out.println(temp+" this number of Didgits is : "+cnt);
	}
}