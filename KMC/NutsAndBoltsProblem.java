package KMC;

import java.util.HashMap;
import java.util.Map;

public class NutsAndBoltsProblem {

	public static void main(String[] args) {
		    char nuts[] = {'@', '#', '$', '%', '^', '&'}; 
		    char bolts[] ={'$', '%', '&', '^', '@', '#'}; 
		    
		    Map<Character,Integer> map=new HashMap<>();
		    for(int i=0;i<nuts.length;i++)
		    {
		    	char ch=nuts[i];
		    	if(!map.containsKey(ch))
		    		map.put(ch,1);
		    	else
		    		map.put(ch,map.get(ch)+1);
		    }
		    for(int j=0;j<bolts.length;j++)
		    {
		    	char ch=bolts[j];
		    	if(map.containsKey(ch))
		    	{
		    		nuts[j]=bolts[j];
		    	}
		    }
		    
		    for(int k=0;k<nuts.length;k++)
		    {
		    	System.out.print(nuts[k]+" ");
		    }
		    System.out.println();
		    for(int l=0;l<bolts.length;l++)
		    {
		    	System.out.print(bolts[l]+" ");
		    }
		    
	}
}
