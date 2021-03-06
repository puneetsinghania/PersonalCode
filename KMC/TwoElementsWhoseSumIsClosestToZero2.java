package KMC;

import java.util.Arrays;

public class TwoElementsWhoseSumIsClosestToZero2 {

	public static void main(String[] args) {
		int ar[] = {1, 60, -10, 70, -80, 85};
		
		Arrays.sort(ar);
		 
		 int mindiff=Integer.MAX_VALUE;
		 int minIndexI=0;
		 int minIndexJ=0;
		 int given=0;
		 
		 int l=0;
		 int r=ar.length-1;
		 while(l<r)
		 {
			 int sum=ar[l]+ar[r];
			 int diff=Math.abs(sum-given);
			 if(diff<mindiff)
			 {
				 mindiff=diff;
				 minIndexI=l;
				 minIndexJ=r;
			 }
			 else if(sum>given)
			 {
				 r--;
			 }
			 else
				 l++;
		 }
		 System.out.println(mindiff+"--> "+ar[minIndexI]+","+ar[minIndexJ]);
		 
	}
}
