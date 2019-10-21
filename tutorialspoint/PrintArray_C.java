package tutorialspoint;

import java.util.Arrays;

public class PrintArray_C {
	
	   public static void main(String[] args) {
		      String[][] deepArr = new String[][] {{"Sai", "Gopal"}, {"Pallavi", "Priya"}};
		     
		      System.out.println(Arrays.deepToString(deepArr));
		      
		      System.out.println(Arrays.toString(deepArr));
	   }

}
