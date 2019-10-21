package tutorialspoint;

public class StringConcatenate_A {
   public static void main(String[] args) {
	   
	  //concat using '+' 
      long startTime = System.currentTimeMillis();
      
      for(int i = 0; i < 5000; i++) {
         String result = "This is"
            + "testing the"
            + "difference"+ "between"
            + "String"+ "and"+ "StringBuffer";
      }
      long endTime = System.currentTimeMillis();
      
      System.out.println("Time taken for string" 
         + "concatenation using + operator : " 
         + (endTime - startTime)+ " ms");
      
      //concat using .append()
      long startTime1 = System.currentTimeMillis();
      
      for(int i = 0; i < 5000; i++) {
         StringBuffer result = new StringBuffer();
         result.append("This is");
         result.append("testing the");
         result.append("difference");
         result.append("between");
         result.append("String");
         result.append("and");
         result.append("StringBuffer");
      }
      long endTime1 = System.currentTimeMillis();
      
      System.out.println("Time taken for String concatenation" 
         + "using StringBuffer : "
         + (endTime1 - startTime1)+ " ms");
   }
}