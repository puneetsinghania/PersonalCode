package VVK;

import java.util.Arrays;

public class ReverseAnArrayWithoutExtraSpace {
	
	public static void main(String[] args) {
		
		int[] ar= {1,2,3,4,5};
		
		int l=0;
		int r=ar.length-1;
		
		while(l<r)
		{
			int temp=ar[l];
			ar[l]=ar[r];
			ar[r]=temp;
			
			l++;
			r--;
		}
		System.out.println(Arrays.toString(ar));
	}

}
