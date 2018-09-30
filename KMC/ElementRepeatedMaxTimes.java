package KMC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ElementRepeatedMaxTimes {

	public static void main(String[] args) {
		int[] ar={101,102,102,101,104,102};
		int max=0;
		int maxElement=0;
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<ar.length;i++)
		{
			int ch=ar[i];
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
			else
				map.put(ch,map.get(ch)+1);
			
		}
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int keyco=itr.next();
			if(map.get(keyco)>max)
			{
				max=map.get(keyco);
				maxElement=keyco;
			}
			
		}
		System.out.println(maxElement+"-->"+max);
		
	}
}
