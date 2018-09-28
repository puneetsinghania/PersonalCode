package FAQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MissingElementsOfRangeNOTPROPER {

	public static void main(String[] args) {
		int ar[] = {1, 14, 11, 51, 15};
		int  low = 50, high = 55;
		
		Arrays.sort(ar);
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<ar.length-1;i++)
		{
			int ch=ar[i];
			if(!map.containsKey(ch))
			{
				map.put(ar[i],ar[i+1]-ar[i]);
			}

		}
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int keyco=itr.next();
			if(keyco>low && keyco<high)
			{
				int count=keyco;
				for(int j=0;j<map.get(keyco)-1;j++)
				{
					System.out.print(++count+" ");
				}
			}
		}
		
	}
}
