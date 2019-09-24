
public class IsStrongNumber {

	public static void main(String[] args) {
		int number=145;
		int num=number;
		
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			int fact=factorial(r);
			sum=sum+fact;
			num=num/10;
		}
		
		if(sum==number)
			System.out.println("Strong number");
		else
			System.out.println("Not a Strong number");
	}
	
	public static int factorial(int num)
	{
		int facto=1;
		for(int i=num;i>=1;i--)
		{
			facto=facto*i;
		}
		return facto;
	}
}
