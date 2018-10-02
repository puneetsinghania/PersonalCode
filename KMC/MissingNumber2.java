package KMC;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber2 {
	
	public static void main(String[] args) {
		int[] ar={1,2,4,6,3,7,8};
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		//System.out.println(set);
		for(int j=0;j<ar.length-1;j++)
		{
			if(!set.contains(ar[j]+1))
					{
					System.out.println(ar[j]+1);
					}
		}
	}

}
