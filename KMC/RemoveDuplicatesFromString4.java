package KMC;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString4 {

	public static void main(String[] args) {
		String str= "geeksforgeeks";
		
		char[] ar=str.toCharArray();
		
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		//System.out.println(set);
		for(Character ch:set)
		{
			System.out.print(ch+" ");
		}
	}
}
