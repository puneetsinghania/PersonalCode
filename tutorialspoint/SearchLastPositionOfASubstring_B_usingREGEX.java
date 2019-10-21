package tutorialspoint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchLastPositionOfASubstring_B_usingREGEX {
	
	 public static void main(String[] args) {
		 String REGEX= "Hello";
		 String INPUT = "Hello world ,Hello Reader";
		 
		 Pattern p=Pattern.compile(REGEX);
		 Matcher m=p.matcher(INPUT);
		 Integer lastPosition=null;
		 
		 while(m.find())
		 {
			lastPosition=m.start(); 
		 }
	      
		 System.out.println(lastPosition);
  }

}
