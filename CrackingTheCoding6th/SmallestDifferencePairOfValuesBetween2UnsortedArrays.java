package CrackingTheCoding6th;

import java.util.Arrays;

public class SmallestDifferencePairOfValuesBetween2UnsortedArrays {

	public static void main(String[] args) {
		
		int A[] = {1, 2, 11, 5}; 
        int B[] = {4, 12, 19, 23, 127, 235}; 
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i=0,j=0;
        int mindiff=Integer.MAX_VALUE;
        int indexI=0;
        int indexJ=0;
        
        while(i<A.length && j<B.length)
        {
        	int diff=Math.abs(A[i]-B[j]);
        	if(diff<mindiff)
        	{
        		mindiff=diff;
        		indexI=i;
        		indexJ=j;
        	}
        	if(A[i]<B[j])
        	{
        		i++;
        	}
        	else if(A[i]>B[j])
        	{
        		j++;
        	}
        	
        }
        System.out.println(mindiff);
	}
}
