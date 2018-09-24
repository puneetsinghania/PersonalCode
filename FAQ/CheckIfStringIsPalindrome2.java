package FAQ;

public class CheckIfStringIsPalindrome2 {

	public static void main(String[] args) {
		String str="madam oo madam";
		
		char[] ar=str.toCharArray();
		boolean isPalindrome=true;
		int l=0;
		int r=ar.length-1;
		
		while(l<=r)
		{
			if(ar[l]==ar[r])
			{
				l++;
				r--;
			}
			else
			{
				isPalindrome=false;
				break;
			}
			
		}
		if(isPalindrome==true)
			System.out.println("YES,Its a Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
