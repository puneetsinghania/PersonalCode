import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventDup {
	
	public static void main(String[] args) {
		
		int[] ar= {1,2,3,3,4,5};
		
	/*	Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<ar.length;i++)
		{
			int ch=ar[i];
			if(!set.contains(ch) && )
			{
				set.add(ch);
				System.out.println(ch+" is unique ");
			}
			else
			{
				System.out.println(ch+" is duplicate ");
			}
		}
		*/
		Map<Integer,Set<Integer>> map=new HashMap<Integer,Set<Integer>>();
		
		
		for(int i=1;i<=200;i++)
		{
			int j=i;
			boolean flag=false;
			if(j>60) {
				flag=true;
				j=j%60;}
			if(!map.containsKey(j))
			{
				Set<Integer> set=new HashSet<>();
				set.add(j);
				map.put(j,set);
			}
			else
			{
				Set<Integer> sett=map.get(j);
				sett.add(j);
				map.put(j,sett);
			}
			
		}
		
		
	}

}
