
public class IsDisariumNumber {
	
	public static void main(String[] args) {
		int number=135;
		int num=number;
		
		int c=countDigits(num);
		int sum=0;
		
		while(num>0)
		{
			int r=num%10;
			sum=sum+power(r,c);
			c--;
			num=num/10;
		}
		if(sum==number)
			System.out.println("Disarium number");
		else
			System.out.println("Not a Disarium number");
	}
	
	public static int countDigits(int num)
	{
		int count=0;
		while(num>0)
		{
			int r=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
	
	public static int power(int num,int pow)
	{
		int powo=1;
		for(int i=1;i<=pow;i++)
		{
			powo=powo*num;
		}
		return powo;
	}

}
