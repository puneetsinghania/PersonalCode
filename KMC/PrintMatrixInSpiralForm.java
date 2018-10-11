package KMC;

public class PrintMatrixInSpiralForm {

	public static void main(String[] args) {
		int R = 3; 
        int C = 6; 
        int a[][] = { {1,  2,  3,  4,  5,  6}, 
                      {7,  8,  9,  10, 11, 12}, 
                      {13, 14, 15, 16, 17, 18} 
                    };
        
        
        int l=0;//starting index of column
        int r=0;//starting index of row
        int last_col=C-1;//ending index of column
        int last_row=R-1;//ending index of row
        
        while(l<=last_col && r<=last_row)
        {
        	for(int i=l;i<=last_col;i++)
        	{
        		System.out.print(a[r][i]+" ");
        	}
        	r++;
        	for(int i=r;i<=last_row;i++)
        	{
        		System.out.print(a[i][last_col]+" ");
        	}
        	last_col--;
        	
        	if(r<=last_row){
        	for(int i=last_col;i>=l;i--)
        	{
        		System.out.print(a[last_row][i]+" ");
        	}
        	last_row--;
        	}
        	if(l<=last_col){
        	for(int i=last_row;i>=r;i--)
        	{
        		System.out.print(a[i][l]+" ");
        	}
        	l++;
        	}
        	
        }
        
	}
}
