package KMC;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveCharactersFrom1stStringWhichArePresentIn2ndString {

	public static void main(String[] args) {
		String str1="geeksforgeeks";
		String str2="mask";
		
		char[] ar1=str1.toCharArray();
		char[] ar2=str2.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<ar1.length;i++)
		{
			char ch=ar1[i];
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
			else
				map.put(ch,map.get(ch)+1);
		}
		for(int j=0;j<ar2.length;j++)
		{
			char ch=ar2[j];
			if(map.containsKey(ch))
			{
				map.put(ch,0);
			}
		}
		Iterator<Character> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			char keyco=itr.next();
			int count=map.get(keyco);
			if(count!=0)
			{
				for(int m=0;m<count;m++)
				{
					System.out.print(keyco+" ");
				}
			}
		}
		
		
	}
}
