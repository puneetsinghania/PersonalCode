package FAQ;

import java.util.Arrays;

public class CheckIfStringIsPalindrome1 {

	public static void main(String[] args) {
		String str="puup";
		
		char[] a=str.toCharArray();
		char[] b=new char[a.length];
		
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		boolean isPalindrome=Arrays.equals(a,b);
		if(isPalindrome==true)
			System.out.println("YES,Its a Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
