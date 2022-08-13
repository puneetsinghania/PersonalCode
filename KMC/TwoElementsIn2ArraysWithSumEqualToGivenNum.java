package KMC;

import java.util.HashSet;
import java.util.Set;

public class TwoElementsIn2ArraysWithSumEqualToGivenNum {

	public static void main(String[] args) {
		int[] ar = {1, 4, 7, 6, 10, 8, 9,7};
		int[] br = {3, 5, 8, 1, 10, 6, 9,7};
		int K= 19;

		boolean isPresent= find(ar,br,K);
		System.out.println(isPresent);
	}

	public static boolean find(int[] ar,int[] br,int K )
	{
		Set<Integer> set= new HashSet<>();
		for(int i:ar)
		{
			set.add(i);
		}

		for(int j:br)
		{
			if(set.contains(K-j))
				return true;
		}
		return false;
	}
}
