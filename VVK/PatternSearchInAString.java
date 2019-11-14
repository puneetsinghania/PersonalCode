package VVK;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSearchInAString {
	
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("acbacdabcy");
		Matcher m=p.matcher("acbacxabcdabxabcdacbacdabcy");
		
		while(m.find())
		{
			System.out.println(m.start());
		}
	}

}
