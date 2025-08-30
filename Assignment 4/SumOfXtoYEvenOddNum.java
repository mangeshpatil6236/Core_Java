import java.util.Scanner;
public class SumOfXtoYEvenOddNum{
	public static void main(String[] args){

		int sumE=0, sumO=0, x, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Range to Sum of Between Even or Odd Numbers : ");
		x = sc.nextInt();
		y = sc.nextInt();
	
		for(int i=x; i<=y; i++)
		{
			if(i%2==0)
				sumE += i;
			else
				sumO += i;
		}

		System.out.println("Sum Of "+x+" to "+y+" Even Numbers : "+sumE);
		System.out.println("Sum Of "+x+" to "+y+" Odd Numbers : "+sumO);
	}
}