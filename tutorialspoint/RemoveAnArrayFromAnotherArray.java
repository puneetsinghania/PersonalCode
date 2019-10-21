package tutorialspoint;

import java.util.ArrayList;

public class RemoveAnArrayFromAnotherArray {
	
	 public static void main(String[] args)  {
	      ArrayList objArray = new ArrayList();
	      ArrayList objArray2 = new ArrayList();
	      
	      objArray2.add(0,"common1");
	      objArray2.add(1,"common2");
	      objArray2.add(2,"notcommon");
	      objArray2.add(3,"notcommon1");
	      
	      objArray.add(0,"common1");
	      objArray.add(1,"common2");
	      objArray.add(2,"notcommon2");
	      
	      objArray.removeAll(objArray2);
	      
	      System.out.println("Array1 after removing array2 from array1==>"+objArray);

	 }

}
