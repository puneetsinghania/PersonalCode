package KMC;

import java.util.Arrays;

public class MissingNumber4 {

	public static void main(String[] args) {
		int[] ar={1,2,4,6,3,7,8};
		
		Arrays.sort(ar);
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=ar[i]+1;j<ar[i+1];j++)
			{
				System.out.print(j+" ");
			}
		}
	}
}
