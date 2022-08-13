package KMC;

import java.util.Arrays;

public class CheckIfDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] ar= {1,3,2,4,3,2,4};

		boolean res=checkIfDuplicatesInArray(ar);
		System.out.println(res);
	}

	public static boolean checkIfDuplicatesInArray(int[] ar)
	{
		Arrays.sort(ar);

		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
				return true;
		}
		return false;
	}
}
