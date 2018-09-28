package FAQ;

import java.util.HashSet;
import java.util.Set;

public class WhetherAnArrayIsSubsetOfAnotherArray2 {

	public static void main(String[] args) {
		int parent[] = {11, 1, 13, 21, 3, 7}; 
	    int child[] = {11, 3, 7, 1};
	    
	    boolean isSubset=true;
	    
	    Set<Integer> set=new HashSet<>();
	    for(int i=0;i<parent.length;i++)
	    {
	    	set.add(parent[i]);
	    }
	    for(int j=0;j<child.length;j++)
	    { 
	    	if(!set.contains(child[j]))
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
	    	System.out.println("NOT a subset");
	    }
	}
}
