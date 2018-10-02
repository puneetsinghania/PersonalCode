package KMC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MissingNumber5 {

	public static void main(String[] args) {
		int[] ar={1,2,4,6,3,7,8};
		
		Arrays.sort(ar);
		Map<Integer,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<ar.length-1;i++)
		{
			int ch=ar[i];
			map.put(ch,ar[i+1]-ar[i]);
		}
		//System.out.println(map);
		
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int keyco=itr.next();
			int count=keyco;
			for(int j=0;j<map.get(keyco)-1;j++)
			{
				System.out.print(++count+" ");
			}
			
		}
	}
}
