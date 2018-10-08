package KMC;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

//Need to improve!
public class NextNumberInTheSequence {
	
	static Map<Character,Integer> map=new LinkedHashMap<>();
	static int nth=5;
	static String start="1";
	static int count=1;
	public static void main(String[] args) {
	
		String next=NextNumber(start,nth);
		System.out.println(next);
		
	}
	static String NextNumber(String start,int nth)
	{
		String st="";
		char[] ar=start.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			char ch=ar[i];
			if(!map.containsKey(ch))
				map.put(ch,1);
			else
				map.put(ch,map.get(ch)+1);
		}
		Iterator<Character> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			char keyco=itr.next();
			st=st+map.get(keyco)+keyco;
		}
		
		if(count<nth-1)
		{
			count++;
			map.clear();
		return NextNumber(st,nth);
		}
		else
		{
		return st;	
		}
	}

}
