package tutorialspoint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWordInsideString_B{
	
	public static void main(String[] args) {
		String INPUT = "Hello readers";
		
		String REGEX="Hello";
		
		Pattern p=Pattern.compile(REGEX);
		Matcher m=p.matcher(INPUT);
		
		if(m.find())
		{
			System.out.println(m.start());
		}
	
	}

}
