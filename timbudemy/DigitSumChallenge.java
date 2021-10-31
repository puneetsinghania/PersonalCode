package timbudemy;

public class DigitSumChallenge {
	
	public static void main(String[] args)
	{
		int sum=sumDigits(256);
		System.out.println(sum);
	}
	
	public static int sumDigits(int number)
	{
		int sum=0;
		if(!(number>=10))
			return -1;
		
		while(number>0)
		{
			int rem=number%10;
			sum+=rem;
			
			number/=10;
		}
		return sum;
			
	}

}
