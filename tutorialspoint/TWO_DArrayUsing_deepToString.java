package tutorialspoint;

import java.util.Arrays;

public class TWO_DArrayUsing_deepToString {

	
	public static void main(String[] args) 
    { 
        // Create a 2D array 
        int[][] mat = new int[2][2]; 
        mat[0][0] = 99; 
        mat[0][1] = 151; 
        mat[1][0] = 30; 
        mat[1][1] = 5; 
       
        System.out.println(Arrays.deepToString(mat)); 

        System.out.println(mat.toString()); 
        
        /* Uncommenting below code would cause error as  
        deepToString() doesn't work for primitive types 
        
        int []  arr2 = {10, 20, 30, 40}; 
        System.out.println(Arrays.deepToString(arr2));   */
    }
}
