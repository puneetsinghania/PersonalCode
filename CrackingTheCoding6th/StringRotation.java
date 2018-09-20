package CrackingTheCoding6th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRotation {

	public static void main(String[] args) {
		String s1="waterbottle";
		String s2="erbottlewat";
		boolean isSubstring=false;
		
		if(s1.length()==s2.length() && s1.length()>0)
		{
			String s3=s1+s1;
			isSubstring=isSubstring(s3,s2);
		}
		else
		{
			System.out.println("Not equal lengths");
		}
		if(isSubstring==true)
			System.out.println("Its a substring");
		else
			System.out.println("Not a substring");
	
	}
	static boolean isSubstring(String s3,String s2)
	{
		Pattern p=Pattern.compile(s2);
		Matcher m=p.matcher(s3);
		while(m.find())
			{
			return true;
			}
		return false;
		
	}
}
