package VVK;

public class CheckIfPrime {
	
	public static void main(String[] args) {
		
		int num=7;
		int i=0;
		
		for(i=2;i<=Math.floor(Math.sqrt(num));i++)
		{
			if(num%i==0)
			{
				System.out.println("Not a prime");
				break;
			}
		}
		if(i==Math.floor(Math.sqrt(num))+1)
		{
			System.out.println("Prime number");
		}
	}

}
