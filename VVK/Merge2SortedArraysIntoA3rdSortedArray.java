package VVK;

import java.util.Arrays;

public class Merge2SortedArraysIntoA3rdSortedArray {
	
	public static void main(String[] args) {
		int[] ar1= {1,3,5,7,9};
		int[] ar2= {2,4,8,10,11,12,16};
		
		int[] ar3= new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		
		while(i<ar1.length && j<ar2.length)
		{
			if(ar1[i] < ar2[j])
			{
				ar3[k]=ar1[i];
				k++;
				i++;
			}
			else
			{
				ar3[k]=ar2[j];
				k++;
				j++;
			}
		}
		
		while(i<ar1.length)
		{
				ar3[k]=ar1[i];
				k++;
				i++;
			
		}
		
		while(j<ar2.length)
		{
				ar3[k]=ar2[j];
				k++;
				j++;
		}
		
		System.out.println(Arrays.toString(ar3));
		
	}

}
