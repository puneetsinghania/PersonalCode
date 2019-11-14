package VVK;

public class SearchAnElementInASortedMatrix {
	
	public static void main(String[] args) {
		
		  int mat[][] = {{10, 20, 30, 40},  
				  		 {12, 22, 33, 45},  
				  		 {14, 24, 44, 47},  
				  		 {16, 26, 46, 50}};
		  
		  int key=24;
		  
		  int rows=mat.length;
		  int cols=mat[0].length;
		  
		  int i=0;
		  int j=cols-1;
		  
		  while(i<rows && j>=0)
		  {
			  if(key==mat[i][j])
			  {
				  System.out.println("FOUND");
				  break;
			  }
			  else if(key<mat[i][j])
			  {
				  j--;
			  }
			  else if(key>mat[i][j])
			  {
				  i++;
			  }
		  }
		
	}

}
