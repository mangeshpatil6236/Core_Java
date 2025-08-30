import java.util.Scanner;
public class CountFactorsOfGivenNum{
	public static void main(String[] args){

		int n, cnt = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
				cnt++;
		}

		System.out.println(n+" number of Factors of Count is : "+cnt);
	}
}


 