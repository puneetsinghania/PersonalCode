
public class PerfectNum {

	public static void main(String[] args) {
		int num=28;
		
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			sum=sum+i;
		}
		if(sum==num)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a perfect num");
		}
	}
}
