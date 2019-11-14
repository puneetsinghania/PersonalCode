package VVK;

import java.util.Arrays;

public class NextGreatestElement {
	
	public static void main(String[] args) {
		
		int[] ar= {3,4,20,6,15,2,1,7};
		
		int mfr=ar[ar.length-1];
		
		for(int i=ar.length-2;i>=0;i--)
		{
			if(ar[i]>mfr)
				mfr=ar[i];
			else
				ar[i]=mfr;
		}
		
		System.out.println(Arrays.toString(ar));
	}

}
