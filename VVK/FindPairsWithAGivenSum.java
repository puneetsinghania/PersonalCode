package VVK;

import java.util.Arrays;

public class FindPairsWithAGivenSum {
	
	public static void main(String[] args) {
		
		int[] ar= {5,8,3,4,2,6,10,7,1,9};
		int given=11;
		
		Arrays.sort(ar);
		
		int l=0;
		int r=ar.length-1;
		
		while(l<r)
		{
			if(ar[l]+ar[r]==given)
			{
				System.out.println(ar[l]+","+ar[r]);
				l++;
				r--;
			}
			else if(ar[l]+ar[r]>given)
				r--;
			else
				l++;
		}
		
	}

}
