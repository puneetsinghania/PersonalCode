package VVK;

import java.util.Arrays;

public class RotationOfArrayByN_places {
	
	public static void main(String[] args) {
		
		int[] ar= {1,2,3,4,5,6,7};
		
		int d=2;
		int n=ar.length;
		
		int l=0;
		int r=n-1-d;
		while(l<r)
		{
			int temp=ar[l];
			ar[l]=ar[r];
			ar[r]=temp;
			l++;
			r--;
		}
		
		//System.out.println(Arrays.toString(ar));
		 l=n-d;
		 r=n-1;
		while(l<r)
		{
			int temp=ar[l];
			ar[l]=ar[r];
			ar[r]=temp;
			l++;
			r--;
		}
		//System.out.println(Arrays.toString(ar));
		 l=0;
		 r=n-1;
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
