import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class ModifyingValueWhileIteratingMap {

	public static void main(String[] args) {
		 Map<String, Integer> map=new LinkedHashMap<String, Integer>(); //LinkedHashMap used so that we could maintain insertion order.
	       
	     map.put("Puneet",7204);
	     map.put("Rahul",1234);
	     
	       System.out.println("Beforemap--> "+map);
	      
	       Iterator<String> itr=map.keySet().iterator();
	       while(itr.hasNext()){
	           String keyco=itr.next();
	          
	          if(keyco=="Puneet")
	        	  map.put(keyco, 1993);
	          
	       }
	       System.out.println("AfterMap-->  "+map);
	}
}
