package KMC;

public class SearchInARowwiseAndColumnwiseSortedMatrix1 {

	public static void main(String[] args) {
		int mat[][] = { {10, 20, 30, 40}, 
                		{15, 25, 35, 45}, 
                		{27, 29, 37, 48}, 
                		{32, 33, 39, 50} };
	
		int given=29;
		int n=4;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(given==mat[i][j])
				{
					System.out.println("Found at-->"+i+","+j);
					break;
				}
			}
		}
	}
}
