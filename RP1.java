import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RP1 {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map=new HashMap<>();
		map.put(3,5);
		map.put(4,6);
		map.put(1,2);
		map.put(5,7);
		
		Iterator<Integer> itr=map.keySet().iterator();
		
		Set<Integer> set10=map.keySet();
		
		while(itr.hasNext())
		{
			int keyco=itr.next();
			int checkin=keyco;//3
			int checkout=map.get(keyco);//5
			
			for(int a:set10)
			//2
			{
				if(a<checkout && a>checkin)
				{
				System.out.println("conflict with "+checkin+","+checkout+","+"a="+a);
				break;
				}
			}
		}
		
		
	}
}
