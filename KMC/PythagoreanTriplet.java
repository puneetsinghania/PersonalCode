package KMC;

import java.util.Arrays;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		int ar[] = {3, 1, 4, 6, 5};
		
		Arrays.sort(ar);	
		
		for(int i=0;i<ar.length-2;i++)
		{
			int l=i+1;
			int r=ar.length-1;
			while(l<r)
			{
				if((ar[i]*ar[i])+(ar[l]*ar[l])==ar[r]*ar[r])
				{
					System.out.println("Found-->"+ar[i]+","+ar[l]+"="+ar[r]);
					break;
				}
				else if((ar[i]*ar[i])+(ar[l]*ar[l])<ar[r]*ar[r])
					r--;
				else
					l++;
			}
		}
	}
}
