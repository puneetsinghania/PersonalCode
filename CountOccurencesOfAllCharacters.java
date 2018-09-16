import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class CountOccurencesOfAllCharacters {

	public static void main(String[] args) {
		String str="{}()235ABaABCCa23";
		
		char[] ar=str.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			char ch=ar[i];
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
			else if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			
		}
		Iterator<Character> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			char keyCo=itr.next();
			System.out.print(keyCo+"-->"+map.get(keyCo));
			System.out.println();
		}
		
	
	}
}
