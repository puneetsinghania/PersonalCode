package VVK;

public class Kadane_LargestSumContiguousSubarray {

	public static void main(String[] args) {
		int [] ar = {1,-2, -3, 4, -1, -2, 1, 5, -3};
		
		int sum=0,maxsum=0,start=0,end=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
			if(sum<0)
			{
				sum=0;
				start=i+1;
			}
			else if(sum>maxsum)
			{
				maxsum=sum;
				end=i;
			}
		}
		System.out.println("Maxsum->"+maxsum);
		System.out.println("("+start+","+end+")");
	}
}
