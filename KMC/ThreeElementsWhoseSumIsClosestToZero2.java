package KMC;

import java.util.Arrays;

public class ThreeElementsWhoseSumIsClosestToZero2 {

	public static void main(String[] args) {
		int ar[] = {1, 60, -10, 70, -80, 85};
		
		Arrays.sort(ar);
		int given=0;
		int mindiff=Integer.MAX_VALUE;
		int minIndexI=0;
		int minIndexJ=0;
		int minIndexK=0;
		
		for(int i=0;i<ar.length-2;i++)
		{
			int l=i+1;
			int r=ar.length-1;
			while(l<r)
			{
				int sum=ar[i]+ar[l]+ar[r];
				int diff=Math.abs(sum-given);
				if(diff<mindiff)
				{
					mindiff=diff;
					minIndexI=i;
					minIndexJ=l;
					minIndexK=r;
				}
				else if(sum<given)
				{
					l++;
				}
				else
					r--;
					
			}
		}
		 System.out.println(mindiff+"--> "+ar[minIndexI]+","+ar[minIndexJ]+","+ar[minIndexK]);
	}
}
