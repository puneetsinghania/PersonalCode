package CrackingTheCoding6th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class PrintAllAnagramsTogetherForGivenArrayOfWords {

	public static void main(String[] args) {
	
		String str[] = { "cat", "dog", "tac", "god", "act" }; 
		
		HashMap<Integer,List<String>> map=new LinkedHashMap<>();
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			char[] ar=word.toCharArray();
			Arrays.sort(ar);
			String newword=new String(ar);
			int hashcod=newword.hashCode();
			
			if(map.containsKey(hashcod))
			{
				ArrayList<String> l=(ArrayList<String>) map.get(hashcod);
				l.add(word);
				map.put(hashcod,l);
			}
			else
			{
				List<String> list=new ArrayList<>();
				list.add(word);
				map.put(hashcod,list);
			}
			
		}
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int a=itr.next();
			List<String> li=map.get(a);
			if(li.size()>1)
			{
				System.out.print(li);
			}
		
		}
	}
}
