package FAQ;

public class LargestSubarrayWithEqualNumberOf0sAnd1s {

	public static void main(String[] args) {
		int ar[] = {1, 0, 1, 1, 1, 0, 0};
		
		int fcount=0;
		int maxlen=0;
		int start=0;
		int end=0;
		
		for(int i=0;i<ar.length;i++)
		{
			int count1=0,count0=0;
			for(int j=i;j<ar.length;j++)
			{
				int ch=ar[j];
				if(ch==1)
					count1++;
				if(ch==0)
					count0++;
				
				if(count1==count0)
				{
					//fcount++;
					int len=j-i+1;
					if(len>maxlen)
					{
						maxlen=len;
						start=i;
						end=j;
						
					}
				}
				
			}
			
		}
		//System.out.println(fcount);
		System.out.println(maxlen);
		System.out.println(start+","+end);
	}
}
