import java.util.*;
public class Walmart1 {

	    static void printLargest(ArrayList<String> arr){ 
	      
	        Collections.sort(arr, new Comparator<String>(){ 
	  
	        @Override
	        public int compare(String a, String b) { 
	        
	        String ab=a + b; 
	      
	        String ba=b + a; 
	     
	        return ab.compareTo(ba) > 0 ? -1:1; 
	    } 
	    }); 
	          
	    Iterator it = arr.iterator(); 
	  
	    while(it.hasNext()) 
	        System.out.print(it.next()); 
	      
	    } 
	      
	    // driver program 
	    public static void main (String[] args) { 
	          
	        ArrayList<String> arr; 
	        arr = new ArrayList<>(); 
	          
	        //output should be 6054854654 
	        arr.add("54"); 
	        arr.add("546"); 
	        arr.add("548"); 
	        arr.add("60"); 
	        printLargest(arr); 
	         
	      
	    } 
	} 

