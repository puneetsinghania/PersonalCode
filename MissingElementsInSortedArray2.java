import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class MissingElementsInSortedArray2 {

	public static void main(String[] args) {
		int[] ar={28,32,45,56};
		
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<ar.length-1;i++)
		{
			int ch=ar[i];
			if(!map.containsKey(ch))
			{
				map.put(ch,ar[i+1]-ar[i]);
			}
			
		}
		
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int keyCo=itr.next();
			int count=keyCo;
			for(int j=0;j<map.get(keyCo)-1;j++)
			{
				System.out.print(++count);
				
				System.out.print(" ");
			}
		}
		
	}
}
