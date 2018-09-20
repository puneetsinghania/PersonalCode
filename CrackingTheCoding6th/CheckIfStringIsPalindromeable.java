package CrackingTheCoding6th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckIfStringIsPalindromeable {

	public static void main(String[] args) {
		String str="Tact Coa";
		str=str.replace(" ", "");
		str=str.toLowerCase();
		char[] ar=str.toCharArray();
		int count=0;
		boolean isPalindromable=true;
		
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<ar.length;i++)
		{
			char ch=ar[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, map.get(ch)+1);
			}
	
		}
		Iterator<Character> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			char keyCo=itr.next();
			if((map.get(keyCo))%2!=0)
				count++;
				if(count>1)
				{
				isPalindromable=false;
				break;
				}
		}
		if(isPalindromable==true)
			System.out.println("It is Palindromable");
		else
			System.out.println("It is not Palindromable");
	}
}
