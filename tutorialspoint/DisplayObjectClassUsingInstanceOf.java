package tutorialspoint;

import java.util.ArrayList;
import java.util.Vector;

public class DisplayObjectClassUsingInstanceOf { 
	
   public static void main(String[] args) {
      Object testObject = new ArrayList();
      displayObjectClass(testObject);
   }
   
   public static void displayObjectClass(Object o) {
      if (o instanceof Vector) 
    	  System.out.println("Object was an instance of the class java.util.Vector");
      else if (o instanceof ArrayList) 
    	  System.out.println("Object was an instance of the class java.util.ArrayList");
      else 
    	  System.out.println("Object was an instance of the " + o.getClass());
   }
}
