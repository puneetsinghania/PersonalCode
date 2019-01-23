package SortingAndSearching;

import java.util.Arrays;

public class FindPairInArrayWhoseSumIsClosestToGivenNum2 {

	public static void main(String[] args) {
		int ar[] =  {10, 22, 28, 29, 30, 40}; 
        int given = 54;
        int minIndexI=0,minIndexJ=0;
        
        Arrays.sort(ar);
        int mindiff=Integer.MAX_VALUE;
        int l=0;
        int r=ar.length-1;
        
        while(l<r)
        {
        	int sum=ar[l]+ar[r];
        	int diff=Math.abs(given-sum);
        	if(diff<mindiff)
        	{
        		mindiff=diff;
        		minIndexI=l;
        		minIndexJ=r;
        	}
        	else if(sum<given)
        		l++;
        	else
        		r--;
        }
        System.out.println(mindiff+"--> ("+ar[minIndexI]+","+ar[minIndexJ]+")");
	}
}
