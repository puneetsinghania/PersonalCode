package VVK;

import java.util.Arrays;

public class SortArrayInWaveForm {
	
	public static void main(String[] args) {
		
		int[] ar= {5,3,12,2,6,10,7,9,8};
		
		for(int i=0;i<ar.length-1;i++)
		{
			if(i%2==0)
			{
				if(!(ar[i]<ar[i+1]))
					//swap(i,i+1);
				{
					int temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
			}
			else
			{
				if(!(ar[i]>ar[i+1]))
					//swap(i,i+1);
				{
					int temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ar));
	}
	

}
