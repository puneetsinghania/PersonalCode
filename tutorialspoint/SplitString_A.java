package tutorialspoint;

public class SplitString_A {
	
	public static void main(String[] args) {
	      String s1 = "t u t o r i a l s"; 

	      String[] str=s1.split("\\s");
	      
	      for(String s:str)
	      {
	    	  System.out.println(s);
	      }
	      
	}

}
