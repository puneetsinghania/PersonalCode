package VVK;

import java.util.Arrays;

public class SegregatePositiveAndNegativeNumbers {
	
	public static void main(String[] args) {
		
		int[] ar= {-1,3,8,-4,5,-6,7,-20,30,40};
		
		int i=0;
		int j=ar.length-1;
		
	   while(true) 
	   {
			
		while(i<j && ar[i]<0)
		{
			i++;
		}
		while(i<j && ar[j]>0)
		{
			j--;
		}
		
		if(i<j)
		{
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
		else 
		{
			break;
		}
	}
	   System.out.println(Arrays.toString(ar));

   }
}
