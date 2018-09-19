import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Anagram2 {

	public static void main(String[] args) {
		String s1="Mother in Law";
		String s2="Hitler Woman";
		
		s1=s1.replace(" ","");
		s1=s1.toLowerCase();
		s2=s2.replace(" ","");
		s2=s2.toLowerCase();
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		boolean isAnagram=false;
		
		if(a.length!=b.length)
		{
		isAnagram=false;
		}
		else
	   {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			char ch=a[i];
			if(!map.containsKey(ch))
				map.put(ch, 1);
			else if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
		}
		for(int j=0;j<b.length;j++)
		{
			char ch=b[j];
			if(!map.containsKey(ch))
				map.put(ch, 1);
			else if(map.containsKey(ch))
				map.put(ch, map.get(ch)-1);
		}
		Iterator<Character> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			char keyCo=itr.next();
			if(map.get(keyCo)!=0)
			{
				isAnagram=false;
				break;
			}
			else
			{
				isAnagram=true;
			}
			
		}
	
		
	   }
		if(isAnagram==true)
			System.out.println("They are anagrams");
		else
			System.out.println("Not Anagrams");
			
	}
}
