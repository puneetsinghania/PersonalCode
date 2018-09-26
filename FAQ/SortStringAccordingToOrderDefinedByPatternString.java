package FAQ;

import java.util.HashMap;
import java.util.Map;

public class SortStringAccordingToOrderDefinedByPatternString {

	public static void main(String[] args) {
		String pat = "bxyzca";
		
		String str = "abcabcabc";
		
		char[] ar=str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<ar.length;i++)
		{
			char ch=ar[i];
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
			else
				map.put(ch,map.get(ch)+1);		
		}
		
		char[] pattern=pat.toCharArray();
		
		for(int j=0;j<pattern.length;j++)
		{
			char patt=pattern[j];
			if(map.get(patt)!=null)
			{
				int count=map.get(patt);
				for(int k=0;k<count;k++)
				{
				System.out.print(patt);
				}
			}
		}
		
	}
}
