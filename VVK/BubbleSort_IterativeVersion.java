package VVK;

import java.util.Arrays;

public class BubbleSort_IterativeVersion {
	
	public static void main(String[] args) {
		
		int[] ar= {5,3,1,6,7,2,4,8};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
