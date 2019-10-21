package tutorialspoint;

public class StringComparePerformance {
	   public static void main(String[] args) {      
	      
		  //creation of String literals
		  long startTime = System.currentTimeMillis();
	      
	      for(int i = 0; i < 50000; i++) {
	         String s1 = "hello";
	         String s2 = "hello"; 
	      }
	      long endTime = System.currentTimeMillis();
	      
	      System.out.println("Time taken for creation" 
	         + " of String literals : "+ (endTime - startTime) 
	         + " milli seconds" );  
	      
	      //creation of String objects
	      long startTime1 = System.currentTimeMillis();
	      
	      for(int i = 0; i < 50000; i++) {
	         String s3 = new String("hello");
	         String s4 = new String("hello");
	      }
	      long endTime1 = System.currentTimeMillis();
	      
	      System.out.println("Time taken for creation" 
	         + " of String objects : " + (endTime1 - startTime1)
	         + " milli seconds");
	   }
	}