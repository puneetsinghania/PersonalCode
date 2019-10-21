package tutorialspoint;

import java.util.ArrayList;

public class RemoveElementOfArray_B {
	
	 public static void main(String[] args) {
	      ArrayList<Integer> arr = new ArrayList<Integer>(5);
	      arr.add(20);
	      arr.add(15);
	      arr.add(30);
	      arr.add(45);
	      
	      System.out.println("Array before removing an element=>"+arr);
	      System.out.println("Size before=>"+arr.size());
	      
	      arr.remove(2);

	      System.out.println("Array after removing an element=>"+arr);
	      System.out.println("Size after=>"+arr.size());

	 }

}
