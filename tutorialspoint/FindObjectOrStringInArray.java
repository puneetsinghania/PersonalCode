package tutorialspoint;

import java.util.ArrayList;

public class FindObjectOrStringInArray {
	
	public static void main(String[] args) {
	      ArrayList objArray = new ArrayList();
	      ArrayList objArray2 = new ArrayList();
	      
	      objArray2.add(0,"common1");
	      objArray2.add(1,"common2");
	      objArray2.add(2,"notcommon");
	      objArray2.add(3,"notcommon1");
	      
	      objArray.add(0,"common1");
	      objArray.add(1,"common2");
	
	      System.out.println(objArray.contains("common1"));
	      System.out.println(objArray2.contains(objArray));
	}

}
