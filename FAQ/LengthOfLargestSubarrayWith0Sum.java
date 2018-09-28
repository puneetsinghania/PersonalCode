package FAQ;

public class LengthOfLargestSubarrayWith0Sum {

	public static void main(String[] args) {
		int ar[] = {15, -2, 2, -8, 1, 7, 10, 23};
		
		int maxlen=0;
		int start;
		int end;
		
		for(int i=0;i<ar.length;i++)
		{
			int sum=0;
			int len=0;
			for(int j=i;j<ar.length;j++)
			{
				sum=sum+ar[j];
				
				if(sum==0)
				{
					len=j-i+1;
					if(len>maxlen)
					{
					maxlen=len;
					start=ar[i];
					end=ar[j];
					//System.out.println(start+","+end);
					}
				}
			}
			
		}
		System.out.println(maxlen);

	}
}
