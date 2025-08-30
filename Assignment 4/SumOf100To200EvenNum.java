public class SumOf100To200EvenNum{
	public static void main(String[] args){

		int sum = 0;
	
		for(int i=100; i<=200; i+=2)
		{
			sum += i;
		}
		System.out.println("Sum Of 100 to 200 Even Numbers : "+sum);

		int sum1 = 0;
		for(int i=101; i<=200; i+=2)
		{
			sum1 += i;
		}
		System.out.println("Sum Of 100 to 200 Odd Numbers : "+sum1);
	}
}