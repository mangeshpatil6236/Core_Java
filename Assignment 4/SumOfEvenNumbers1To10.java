public class SumOfEvenNumbers1To10{
	public static void main(String[] args){

		int sum = 0;
		for(int i=2; i<=10; i+=2)
		{
			sum += i;
		}
		System.out.println("Sum of 1 to 10 Even Numbers : "+sum);

		int sum1 = 0;
		for(int i=1; i<=10; i+=2)
		{
			sum1 += i;
		}
		System.out.println("Sum of 1 to 10  Odd Numbers : "+sum1);
	}
}