package VVK;

import java.util.Arrays;

public class Selection_sort_IterativeVersion {
	
	public static void main(String[] args) {
		
		int[] ar= {1,8,9,10,5,2};
		
		for(int i=0;i<ar.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[min])
				{
					min=j;
				}
			}
			int temp=ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
		System.out.println(Arrays.toString(ar));
	}

}
