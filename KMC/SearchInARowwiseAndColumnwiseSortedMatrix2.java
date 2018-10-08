package KMC;

public class SearchInARowwiseAndColumnwiseSortedMatrix2 {

	public static void main(String[] args) {
		
		int mat[][] = { {10, 20, 30, 40}, 
        				{15, 25, 35, 45}, 
        				{27, 29, 37, 48}, 
        				{32, 33, 39, 50} };
		
		int given=29;
		int n=4;
		
		int i=0;
		int j=n-1;
		
		while(i<n && j>=0)
		{
			if(mat[i][j]==given)
			{
				System.out.println("Found at-->"+i+","+j);
				break;
			}
			else if(mat[i][j]>given)
				j--;
			else
				i++;
		}
	}
}
