import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class CountDistinctCharactersInEachWordInSentence {

	public static void main(String[] args) {
		String str="I am very very bad boy who boozes lotsaaaaaa";
		
		String[] ar=str.split(" ");
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			char[] chArray=ar[i].toCharArray();
			for(int j=0;j<chArray.length;j++)
			{
				char ch=chArray[j];
				if(!map.containsKey(ch))
				{
					map.put(ch, 1);
				}
				else
				{
					map.put(ch,map.get(ch)+1);
				}
				
			}
			Set set=map.keySet();
			System.out.println(ar[i]+"-->"+set.size());
			map.clear();
		}
		
	}
}
