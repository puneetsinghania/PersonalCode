package KMC;

import java.util.Arrays;

public class aPlusbPlusCPlusDEqualsGiven_1 {

	public static void main(String[] args) {
		int ar[] = {1, 4, 45, 6, 10, 12}; 
		int given=21;
		
		Arrays.sort(ar);
		for(int i=0;i<ar.length-3;i++)
		{
			for(int j=i+1;j<ar.length-2;j++)
			{
				int l=j+1;
				int r=ar.length-1;
				while(l<r)
				{
		        	if(ar[i]+ar[j]+ar[l]+ar[r]==given)
		        	{
		        		System.out.println(ar[i]+","+ar[j]+","+ar[l]+","+ar[r]);
		        		break;
		        	}
		        	else if(ar[i]+ar[j]+ar[l]+ar[r]>given)
		        		r--;
		        	else
		        		l++;
				}
			}
		}
	}
}
