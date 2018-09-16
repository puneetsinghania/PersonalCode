import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class Segregate0and1WHashmap {

	public static void main(String[] args) {
		
		int[] ar={0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1 ,0 ,0};
		
	Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
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
		int keyC=itr.next();
		for(int i=0;i<map.get(keyC);i++)
		{
		System.out.print(keyC+" ");
		}
	
	}
	
		
		
	}
	
}
