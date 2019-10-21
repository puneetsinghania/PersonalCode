package tutorialspoint;

public class SearchLastPositionOfASubstring_A {
	
	   public static void main(String[] args) {
		      String str = "Hello world ,Hello Reader";
		      int lastIndex = str.lastIndexOf("Hello");
		      if(lastIndex==-1)
		    	  System.out.println("HELLO NOT FOUND");
		      else
		    	  System.out.println(lastIndex);
	   }

}
