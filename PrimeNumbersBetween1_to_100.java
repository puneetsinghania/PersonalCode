
public class PrimeNumbersBetween1_to_100 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			boolean isPrime=isPrimeCheck(i);
					if(isPrime)
						System.out.print(i+" ");
		}
	}
	
	public static boolean isPrimeCheck(int num)
	{
		if(num==1)
		{
			return false;
		}
		
		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0)
			{
				return false;
			}
		}
		return true;
	}
}
