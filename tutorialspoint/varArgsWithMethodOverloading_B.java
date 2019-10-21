package tutorialspoint;

public class varArgsWithMethodOverloading_B {
	
	   static void vararg(Integer... x) {
	      System.out.println("Integer..."); 
	   }
	   
	   static void vararg(String... x) {
	      System.out.println("String..."); 
	   }
	   
	   public static void main(String [] args) {
	      int s = 0;
	      vararg(s,s);
	   }
	   
	}
