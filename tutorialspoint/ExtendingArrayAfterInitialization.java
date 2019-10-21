package tutorialspoint;

import java.util.Arrays;

public class ExtendingArrayAfterInitialization {
	
	 public static void main(String[] args) {
	      String[] names = new String[] { "A", "B", "C" };
	      String[] extended=new String[5];
	      extended[3]="P";
	      extended[4]="S";
	      
	      System.arraycopy(names, 0, extended, 0, names.length);
	      
	      System.out.println(Arrays.toString(extended));
	      
	 }

}
