package FAQ;

import java.util.HashSet;

public class LongestConsecutiveSubsequence2 {

	public static void main(String[] args) {
		int ar[] =  {1, 9, 3, 10, 4, 20, 2};
		int maxcount=0;
		int count=0;
		HashSet<Integer> set=new HashSet<>();
		
		for(int a:ar)
		{
			set.add(a);
		}
		
		for(int i=0;i<ar.length;i++)
		{
			if(!set.contains(ar[i]-1))
			{
				int j=ar[i];
				while(set.contains(j))
				{
					j++;
				}
				count=j-ar[i];
			
			if(count>maxcount)
				maxcount=count;
			}
		}
		System.out.println(maxcount);
		
	}
}
