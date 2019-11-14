package VVK;

public class PrintMatrixDiagonally {
	
	public static void main(String[] args) {
		
		  int mat[][] = {{1, 2, 3, 4, 5},  
            			 {6, 7, 8, 9, 10},  
            			 {11, 12, 13, 14, 15},  
            			 {16, 17, 18, 19, 20}};
		 
		  int rows=mat.length;
		  int cols=mat[0].length;
		  int i,j=0;
		  
		  for(int k=0;k<rows;k++)
		  {
			  i=k;
			  j=0;
			  while(i>=0)
			  {
				  System.out.print(mat[i][j]+" ");
				  i=i-1;
				  j=j+1;
			  }
			  System.out.println();
		  }
		  
		  for(int l=1;l<cols;l++)
		  {
			  i=rows-1;
			  j=l;
			  while(j<cols)
			  {
				  System.out.print(mat[i][j]+" ");
				  i=i-1;
				  j=j+1;
			  }
			  System.out.println();
		  }
		  
		  
	}

}
