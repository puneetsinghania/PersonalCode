package FAQ;

import java.util.Arrays;

public class PairsWithSumEqualToGivenNum1 {

	public static void main(String[] args) {
		int ar[] = {1, 4, 45, 6, 10, 8, 9,7};
		
		Arrays.sort(ar);
		int sum=16;
		
		int l=0;
		int r=ar.length-1;
		
		while(l<r)
		{
			if(ar[l]+ar[r]==sum)
			{
				System.out.println(ar[l]+","+ar[r]);
				l++;
				r--;
			}
				else if(ar[l]+ar[r]>sum)
				r--;
			else
				l++;
		}
	}
}
