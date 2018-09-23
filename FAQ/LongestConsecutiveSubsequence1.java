package FAQ;

import java.util.Arrays;

public class LongestConsecutiveSubsequence1 {

	public static void main(String[] args) {
		int[] ar={36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		
		Arrays.sort(ar);
		int count=1,maxcount=1;
		
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i+1]==ar[i]+1)
			{
				count++;
			}
			else if(ar[i+1]!=ar[i]+1)
			{
				count=1;
			}
			if(count>maxcount)
			{
				maxcount=count;
			}
		}
		System.out.println(maxcount);
	}
}
