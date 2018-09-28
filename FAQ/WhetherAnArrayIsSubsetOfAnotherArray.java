package FAQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WhetherAnArrayIsSubsetOfAnotherArray {

	public static void main(String[] args) {
		int parent[] = {11, 1, 13, 21, 3, 7}; 
	    int child[] = {11, 3, 7, 1};
	    
	    boolean isSubset=true;
	    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<child.length;i++)
	    {
	    	int ch=child[i];
	    	if(!map.containsKey(ch))
	    	{
	    		map.put(ch,1);
	    	}
	    	else
	    		map.put(ch, map.get(ch)+1);
	    }
	    for(int j=0;j<parent.length;j++)
	    {
	    	int ch=parent[j];
	    	if(map.containsKey(ch))
	    	{
	    		map.put(ch, map.get(ch)-1);
	    	}
	    }
	    Iterator<Integer> itr=map.keySet().iterator();
	    while(itr.hasNext())
	    {
	    	int keyco=itr.next();
	    	if(map.get(keyco)!=0)
	    	{
	    		isSubset=false;
	    		break;
	    	}
	    }
	    if(isSubset==true)
	    {
	    	System.out.println("Its a subset");
	    }
	    else
	    {
	    	System.out.println("Not a subset");
	    }
	}
}
