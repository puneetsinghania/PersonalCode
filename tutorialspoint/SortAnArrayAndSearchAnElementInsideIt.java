package tutorialspoint;

import java.util.Arrays;

public class SortAnArrayAndSearchAnElementInsideIt {

	public static void main(String[] args) {
	      int ar[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

	      Arrays.sort(ar);
	      
	      int index=Arrays.binarySearch(ar, 2);
	      System.out.println(index);
	}
}
