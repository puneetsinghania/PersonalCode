package KMC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
        int ar[] = {2,2,2,2,5,5,2,3,3}; 
        	
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<ar.length;i++)
        {
        	int ch=ar[i];
        	if(!map.containsKey(ch))
        	{
        		map.put(ch,1);
        	}
        	else
        	{
        		map.put(ch,map.get(ch)+1);
        	}
        }
       Iterator<Integer> itr=map.keySet().iterator();
       while(itr.hasNext())
       {
    	   int keyco=itr.next();
    	   if(map.get(keyco)>(ar.length/2))
    	   {
    		   System.out.println(keyco);
    		   break;
    	   }
       }
        
	}
}
