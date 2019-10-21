package tutorialspoint;

public class varArgsWithMethod_A {
	
   static int  sumvarargs(int... intArrays) 
   {
	  int sum = 0;
      for(int i = 0; i< intArrays.length; i++) {
         sum += intArrays[i];
      }
      return(sum);
   }
   
   public static void main(String args[]) {
      int sum = 0;
      sum = sumvarargs(new int[]{10,12,33});
      System.out.println(sum);
   }
}