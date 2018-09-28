package FAQ;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int ar[] = {1, 4, 0, 0, 3, 10, 5};

		int sum=0;
		int givenSum=7;
		
		for(int i=0;i<ar.length;i++)
		{
			sum=ar[i];
			int j=i+1;
			while(sum!=givenSum && j<ar.length)
			{
				sum=sum+ar[j];
				j++;
			}
			if(sum==givenSum)
			{
				System.out.println(ar[i]+","+ar[j-1]);
			}
		}
		
		
	}
}
