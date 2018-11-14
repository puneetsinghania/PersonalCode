package CrackingTheCoding6th;

import java.util.Arrays;

public class K_Largest_Elements {
	
	public static void main(String[] args) {
		int[] ar={1, 23, 12, 9,30, 2, 50};
		
		int count=0;
		int k=3;
		Arrays.sort(ar);
		
		for(int i=ar.length-1;i>=0;i--)
		{
			if(count<k)
			{
				System.out.print(ar[i]+" ");
				count++;
			}
		}
	}

}
