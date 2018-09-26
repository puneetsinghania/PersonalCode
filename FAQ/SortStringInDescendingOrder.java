package FAQ;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringInDescendingOrder {

	public static void main(String[] args) {
		String str="alkasingh";
		
		Character[] ar=new Character[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ar[i]=str.charAt(i);
		}
		Arrays.sort(ar,new MyComparator());
		
		for (int k = 0; k < ar.length; k++) 
        { 
			System.out.print(ar[k]);
        } 
		
	}
}
class MyComparator implements Comparator<Character>
{
	public int compare(Character c1,Character c2)
	{
		char ch1=Character.toLowerCase(c1);
		char ch2=Character.toLowerCase(c2);
		return Character.valueOf(ch2).compareTo(Character.valueOf(ch1));
	}
}
