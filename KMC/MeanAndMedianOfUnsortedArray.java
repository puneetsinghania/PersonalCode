package KMC;

import java.util.Arrays;

public class MeanAndMedianOfUnsortedArray {

	public static void main(String[] args) {
		int ar[] = {1, 3, 4, 2, 6, 5, 8, 7};
		
		//Mean
		
		int n=ar.length;
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		
		double mean=(double)sum/n;
		System.out.println(mean);
		
		//Median
		double median;
		Arrays.sort(ar);
		if(n%2!=0)
		{
			median=(double)ar[n/2];
		}
		else
		{
			median=(double)(ar[(n-1)/2]+ar[n/2])/2;
		}
		System.out.println(median);
		
	}
}
