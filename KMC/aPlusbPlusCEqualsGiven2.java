package KMC;

import java.util.HashMap;
import java.util.Map;

public class aPlusbPlusCEqualsGiven2 {
	
	public static void main(String[] args) {
		 int ar[] = { 1, 4, 45, 6, 10, 8 }; 
	     int given=22;
	     
	     Map<Integer,Pairs3> map=new HashMap<>();
	     for(int i=0;i<ar.length-1;i++)
	     {
	    	 for(int j=i+1;j<ar.length;j++)
	    	 {
	    		 map.put(ar[i]+ar[j],new Pairs3(ar[i],ar[j]));
	    	 }
	     }
	     
	     for(int k=0;k<ar.length;k++)
	     {
	    	 int temp=given-ar[k];
	    	 if(map.containsKey(temp))
	    	 {
	    		 Pairs3 p=map.get(temp);
	    		 if(p.first!=ar[k] && p.second!=ar[k])
	    		 {
	    			 System.out.println(p.first+","+p.second+","+ar[k]);
						break;
	    		 }
	    	 }
	     }
	     
		
	}

}

class Pairs3
{
	int first;
	int second;
	Pairs3(int first,int second)
	{
		this.first=first;
		this.second=second;
	}
}
