package KMC;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesFromString3 {

	public static void main(String[] args) {
		String str= "geeksforgeeks";
		
		char[] ar=str.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<ar.length;i++)
		{
			char ch=ar[i];
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
		}
		Iterator<Character> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			char keyco=itr.next();
			if(map.get(keyco)==1)
			{
				System.out.print(keyco+" ");
			}
		}
		
	}
}
