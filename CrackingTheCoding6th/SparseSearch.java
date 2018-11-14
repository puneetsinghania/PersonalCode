package CrackingTheCoding6th;

import java.util.HashMap;
import java.util.Iterator;

public class SparseSearch {
	public static void main(String[] args) {
		String ar[] = {"for", "geeks", "", "", "", "", "ide",  
                "practice", "", "", "", "quiz"}; 
		String key = "geeks"; 
		
		HashMap<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<ar.length;i++)
		{
			String ch=ar[i];
			if(ch!="")
			{
				map.put(ch, i);
			}
		}
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String keyco=itr.next();
			if(keyco==key)
				System.out.println(map.get(keyco));
		}
		
	}

}
