package KMC;

import java.util.Arrays;

public class RemoveDuplicatesFromString1 {

	public static void main(String[] args) {
		String str= "geeksforgeeks";
		
		char[] ar=str.toCharArray();
		
		Arrays.sort(ar);
		int j=0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				ar[j]=ar[i];
				j++;
			}
		}
		ar[j]=ar[ar.length-1];
		j++;
		for(int k=0;k<j;k++)
		{
			System.out.print(ar[k]+" ");
		}
	}
}
