package FAQ;

import java.util.HashSet;

public class PairsWithSumEqualToGivenNum2 {

	public static void main(String[] args) {
		int ar[] = {1, 4, 45, 6, 10, 8, 9,7};

		int sum=16;
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<ar.length;i++)
		{
			int temp=sum-ar[i];
			
			if(set.contains(temp))
				System.out.println(ar[i]+","+temp);
			
			set.add(ar[i]);
		}
	}
}
