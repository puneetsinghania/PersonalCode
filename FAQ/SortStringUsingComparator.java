package FAQ;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringUsingComparator {

	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		
		 Character ar[] = new Character[str.length()]; 
		 
	        for (int i = 0; i < str.length(); i++) 
	        { 
	            ar[i] = str.charAt(i); 
	        } 
		
		
		Arrays.sort(ar,new CustomComparator());
		
		for (int k = 0; k < ar.length; k++) 
        { 
			System.out.print(ar[k]);
        } 
		

	}
}
class CustomComparator implements Comparator<Character>
{

	public int compare(Character c1,Character c2)
	{
		char char1=Character.toLowerCase(c1);
		char char2=Character.toLowerCase(c2);
		return (Character.valueOf(char1)).compareTo(Character.valueOf(char2));
	}
}
