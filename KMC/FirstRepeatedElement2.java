package KMC;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedElement2 {

	public static void main(String[] args) {
		int[] ar={3,2,1,2,2,3};
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<ar.length;i++)
		{
			int ch=ar[i];
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
			else
				map.put(ch,map.get(ch)+1);
			
		}
		for(int j=0;j<ar.length;j++)
		{
			int ch=ar[j];
			if(map.get(ch)>1)
			{
				System.out.println("First Repeated element="+ch);
				break;
			}
		}
	}
}
