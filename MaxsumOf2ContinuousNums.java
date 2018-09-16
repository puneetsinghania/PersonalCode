
public class MaxsumOf2ContinuousNums {

	public static void main(String[] args) {
		int[] ar={5,6,9,1,0,8,5,11};
		
		int maxsum=0;
		int sum=0;
		for(int i=0;i<ar.length-1;i++)
		{
			sum=ar[i]+ar[i+1];
			if(sum>maxsum)
			{
				maxsum=sum;
			}
			
		}
		System.out.println(maxsum);
	
	}
}
