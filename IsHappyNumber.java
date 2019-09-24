
public class IsHappyNumber {
	
	public static void main(String[] args) {
		
		int num=97;
		
		while(num>9)
		{
			int sum=0;
			while(num>0)
			{
				int r=num%10;
				sum=sum+(r*r);
				num=num/10;
			}
			num=sum;
		}
		if(num==1)
			System.out.println("Happy number");
		else
			System.out.println("Not a Happy number");
	}

}
