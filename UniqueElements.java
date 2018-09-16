import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueElements {

	public static void main(String[] args) {
		int[] ar={2,1,9,7,2,9,6};
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			int ch=ar[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else if(map.containsKey(ch))
			{ 
				map.put(ch, map.get(ch)+1);
			}
			
			
		}
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int keyCo=itr.next();
			if(map.get(keyCo)==1)
			{
				System.out.println(keyCo);
			}
			
		}
	
	
	}
}
