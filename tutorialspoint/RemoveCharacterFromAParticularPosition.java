package tutorialspoint;

public class RemoveCharacterFromAParticularPosition {
	
	 public static void main(String args[]) {
	      String str = "this is Java";
	      
	      System.out.println(removeCharacterAt(str,3));
	      
	 }
	 
	 public static String removeCharacterAt(String str,int pos)
	 {
		 return str.substring(0,pos)+str.substring(pos+1);
	 }

}
