package FAQ;

public class CountSubarraysWithEqualNumberOf1sAnd0s {

	public static void main(String[] args) {
		int ar[] = {1, 0, 0, 1, 0, 1, 1};
		
		int fcount=0;
		
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
					fcount++;
				}
				
			}
			
		}
		System.out.println(fcount);
	}
}
