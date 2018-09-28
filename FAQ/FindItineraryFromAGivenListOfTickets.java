package FAQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindItineraryFromAGivenListOfTickets {

	public static void main(String[] args) {
		
		 Map<String, String> map = new HashMap<String, String>();
	        map.put("Chennai", "Banglore");
	        map.put("Bombay", "Delhi");
	        map.put("Goa", "Chennai");
	        map.put("Delhi", "Goa");
	        
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
	       System.out.println(start+"-->"+map.get(start));
    	   start=map.get(start);
    	   while(map.containsKey(start))
    	   {
    		   System.out.println(start+"-->"+map.get(start));
    		   start=map.get(start);
    	   }
	}
}
