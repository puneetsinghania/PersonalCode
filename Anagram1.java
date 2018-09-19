import java.util.Arrays;


public class Anagram1 {

	public static void main(String[] args) {
		String s1="Mother in Law";
		String s2="Hitler Woman";
		
		s1=s1.replace(" ","");
		s1=s1.toLowerCase();
		s2=s2.replace(" ","");
		s2=s2.toLowerCase();
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		
		boolean isAnagram=false;
		if(a.length!=b.length)
		{
			isAnagram=false;
		}
		else
		{
			Arrays.sort(a);
			Arrays.sort(b);
			isAnagram=Arrays.equals(a,b);
		}
			if(isAnagram==true)
				System.out.println("They are anagrams");
			else
				System.out.println("Not Anagrams");
			
		}
	}

