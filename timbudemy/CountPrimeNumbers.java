package timbudemy;

public class CountPrimeNumbers {
	
	public static void main(String[] args)
	{
		int count=0;
		for(int i=0;i<10;i++)
		{
			boolean isPrimeFlag=isPrime(i);
			if(isPrimeFlag)
			{
				System.out.println(i);
				count++;
			}
			if(count==3)
				break;
		}
	}
	
	public static boolean isPrime(int n)
	{
		if(n==0||n==1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}
