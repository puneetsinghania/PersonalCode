package timbudemy;

import java.util.Arrays;

public class ReverseArrayChallenge {
	
	public static void main(String[] args)
	{		
		int[] ar= {1,4,6,9,11};
		System.out.println("BEFORE="+Arrays.toString(ar));
		
		reverse(ar);
		
		System.out.println("AFTER="+Arrays.toString(ar));
	}
	
	public static void reverse(int[] ar)
	{
		for(int i=0,j=ar.length-1;i<=j;i++,j--)
		{
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		
	}

}
