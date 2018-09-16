import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountNoOfOccurencesOfEachElement {

	public static void main(String[] args) {
		int[] ar={8,5,8,6,9,5,6,8,7};
		
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			int ch=ar[i];
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int keyco=itr.next();
			System.out.println(keyco+"-->"+map.get(keyco));
		}
		
	}
}
