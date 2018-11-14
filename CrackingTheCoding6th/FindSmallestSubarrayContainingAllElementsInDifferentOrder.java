package CrackingTheCoding6th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSmallestSubarrayContainingAllElementsInDifferentOrder {

	public static void main(String[] args) {
		Integer A[]= {7,5,9,8,2,1,3,5,7,9,1,1,5,8,8,9,7};
		Integer B[]= {1, 5, 9};
		
		List<Integer> list;
		int index=0;
		int minlength=Integer.MAX_VALUE;
		int indexEnd=0,indexStart=0;
		
		for(int i=0;i<A.length;i++)
		{
			list=new ArrayList<Integer>(Arrays.asList(B));
			//System.out.println(list);
			if(list.contains(A[i]))
			{
				index=i;
				for(;index<A.length;index++)
				{
					if(list.contains(A[index]))
					{
						int removal=A[index];
						list.remove(Integer.valueOf(removal));
					}
					if(list.isEmpty())
						break;
				}
				if(list.isEmpty())
				{
					int length=index+1-i;
					if(length<minlength)
					{
						minlength=length;
						indexStart=i;
						indexEnd=index;
					}
				}
				
			}
		}
		System.out.println("MinLength="+minlength+"-->("+indexStart+","+indexEnd+")");
	}
}
