package Sigtuple;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sigtuple1 {

	public static void main(String[] args) {
		
		 Map<String, String> map = new HashMap<String, String>();
	        map.put("Kochi", "Bangalore");
	        map.put("Delhi", "Chandigarh");
	        map.put("Bangalore", "Delhi");
	        map.put("Chandigarh", "Leh");
	        
	       String start=null;
	       
	       Iterator<String> itr=map.keySet().iterator();
	       while(itr.hasNext())
	       {
	    	   String keyco=itr.next();
	    	   if(start==null)
	    	   {
	    		   if(!map.containsValue(keyco))
	    		   {
	    		   start=keyco;
	    		  
	    		   }
	    	   }
	    	  
	       }
	       System.out.println(start+"->"+map.get(start));
    	   start=map.get(start);
    	   while(map.containsKey(start))
    	   {
    		   System.out.println(start+"->"+map.get(start));
    		   start=map.get(start);
    	   }
	}
}
