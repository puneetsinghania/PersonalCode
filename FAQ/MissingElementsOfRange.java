package FAQ;

import java.util.HashSet;
import java.util.Set;

public class MissingElementsOfRange {

	public static void main(String[] args) {
		int ar[] = {1, 3, 5, 4}; 
		int  low = 1, high = 10;
		
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		for(int j=low;j<=high;j++)
		{
			if(!set.contains(j))
			{
				System.out.print(j+" ");
			}
		}
		
	}
}
