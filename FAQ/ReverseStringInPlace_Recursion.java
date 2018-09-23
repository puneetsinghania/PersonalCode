package FAQ;

public class ReverseStringInPlace_Recursion {

	public static void main(String[] args) {
		String str = "abc";
		
		reverse(str);
	}
	public static String reverse(String str)
	{
		if(str.length()==0||str==null)
		{
			return null;
		}
		else
		{
		System.out.print(str.charAt(str.length()-1));
		return reverse(str.substring(0,str.length()-1));
		}
	}
}
