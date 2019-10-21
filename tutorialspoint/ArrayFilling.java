package tutorialspoint;

import java.util.Arrays;

public class ArrayFilling {
	
	   public static void main(String args[]) {
		      int array[] = new int[6];
		      Arrays.fill(array, 100);
		      
		      System.out.println(Arrays.toString(array));
		      
		      Arrays.fill(array,3,6,50);
		      
		      System.out.println(Arrays.toString(array));
	   }
}
