package KMC;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortAnArrayOf0s1sAnd2s {

	public static void main(String[] args) {
		int ar[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		//1st Approach
		/*Arrays.sort(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");	
		}*/
		
		//2nd Approach
		Map<Integer,Integer> map=new TreeMap<>();
		
		for(int i=0;i<ar.length;i++)
		{
			int ch=ar[i];
			if(!map.containsKey(ch))
				map.put(ch,1);
			else
				map.put(ch,map.get(ch)+1);
		}
		//System.out.println(map);
		
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int keyco=itr.next();
			int count=map.get(keyco);
			for(int j=0;j<count;j++)
			{
				System.out.print(keyco+" ");
			}
		}
		
		
		
	}
}
