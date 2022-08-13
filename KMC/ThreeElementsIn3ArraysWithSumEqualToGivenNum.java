package KMC;

import java.util.HashSet;
import java.util.Set;

public class ThreeElementsIn3ArraysWithSumEqualToGivenNum {

	public static void main(String[] args) {
		int[] ar = {1, 4, 7, 6, 10, 8, 9,7};
		int[] br = {3, 5, 8, 1, 10, 6, 9,7};
		int[] cr = {3, 5, 8, 1, 10, 6, 9,7};
		int K= 30;

		boolean isPresent= find(ar,br,cr,K);
		System.out.println(isPresent);
	}

	public static boolean find(int[] ar,int[] br,int[] cr,int K )
	{
		Set<Integer> set= new HashSet<>();
		for(int a1:ar)
		{
			set.add(a1);
		}

		for(int b1:br)
		{
			for(int c1:cr)
			{
				if(set.contains(K-(b1+c1)))
					return true;
			}
		}
		return false;
	}
}
