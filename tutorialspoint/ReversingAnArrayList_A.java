package tutorialspoint;

import java.util.ArrayList;
import java.util.Collections;

public class ReversingAnArrayList_A {
	
	public static void main(String[] args) {
	      ArrayList arrayList = new ArrayList();
	      arrayList.add("A");
	      arrayList.add("B");
	      arrayList.add("C");
	      arrayList.add("D");
	      arrayList.add("E");
	      
	      Collections.reverse(arrayList);
	      
	      System.out.println("After Reverse Order: " + arrayList);


	}

}
