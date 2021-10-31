package timbudemy;

public class CalculateInterestChallenge {
	
	public static void main(String[] args)
	{
		for(int i=2;i<=8;i++) 
		{
			System.out.println("10000 at "+i+"% interest="+calculateInterest(10000d,(double)i));
		}
		
		System.out.println("-----------------------------------");
		
		for(int i=8;i>=2;i--) 
		{
			System.out.println("10000 at "+i+"% interest="+calculateInterest(10000d,(double)i));
		}
	}
	
	public static double calculateInterest(double amount, double interestRate)
	{
		return (amount*(interestRate/100));
	}

}
