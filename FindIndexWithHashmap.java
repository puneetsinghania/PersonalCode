import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class FindIndexWithHashmap {
	public static void main(String[] args) {
	
		int[] ar={1, 11, 3, 6, 7, 11, 12, 11, 19};
		int key=11;
		Map<Integer,Integer> map=new LinkedHashMap<>();
				for(int i=0;i<ar.length;i++)
			{
				int ch=ar[i];
				if(!map.containsKey(ch))
				{
					map.put(ch, i);	
				}
				else if(map.containsKey(ch))
				{
					map.put(ch, i);	
				}	
			}
				
				Iterator<Integer> itr=map.keySet().iterator();
				while(itr.hasNext())
				{
					int ch2=itr.next();
					if(key==ch2)
					{
					System.out.println(map.get(ch2));
					}
				
				}
				
	}
	
}
