package FAQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapBasedOnValues {

	public static void main(String[] args) {
		String[] strArray={"GeeksforGeeeks", "I", "from", "am"};
		
		Map<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<strArray.length;i++)
		{
			String ch=strArray[i];
			map.put(ch,ch.length());
		}
		System.out.println("Before sorting Map--> "+map);
		Set<Entry<String,Integer>> set=map.entrySet();
		
		List<Entry<String,Integer>> list=new ArrayList<>(set);
		Collections.sort(list,new ValueComparator());
		
		System.out.println("After sorting map-->"+list);
		System.out.println();
		
		for(Map.Entry<String,Integer> entry:list)
		{
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}
}

class ValueComparator implements Comparator<Map.Entry<String,Integer>>
{
	public int compare(Map.Entry<String,Integer> obj1,Map.Entry<String,Integer> obj2)
	{
		return obj1.getValue().compareTo(obj2.getValue());
	}
}
