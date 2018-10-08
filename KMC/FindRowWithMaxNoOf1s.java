package KMC;

public class FindRowWithMaxNoOf1s {

	public static void main(String[] args) {
		  int mat[][] = {{0, 0, 0, 1},  
                  		{0, 0, 0, 1},  
                  		{0, 0, 0, 0},  
                  		{0, 1, 1, 1}};
		  
		  int n=4;
		  int maxcount=0;
		  int maxrowis=0;
		  
		  for(int i=0;i<n;i++)
		  {
			  int count=0;
			  for(int j=0;j<n;j++)
			  {
				  if(mat[i][j]==1)
				  {
					  count++;
				  }
			  }
			  if(count>maxcount)
			  {
				  maxcount=count;
				  maxrowis=i;
			  }
		  }
		  System.out.println("Maxcount=>"+maxcount);
		  System.out.println("MaxRowIs=>"+maxrowis);
	}
}
