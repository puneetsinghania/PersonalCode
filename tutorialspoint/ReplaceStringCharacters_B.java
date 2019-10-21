package tutorialspoint;

public class ReplaceStringCharacters_B {
	
	 public static void main(String args[]){
	      String str = "Hello World";
	 
	      char[] ar=str.toCharArray();
	      String st="";
	      
	      for(int i=0;i<ar.length;i++)
	      {
	    	  if(ar[i]!='H')
	    		  st=st+ar[i];
	    	  
	    	  else if(ar[i]=='H')
	    		  st=st+'W';
	      }
	      
	      System.out.println(st);
	 
	 }

}
