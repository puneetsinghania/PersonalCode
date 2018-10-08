package KMC;

public class FindIndexOfFirst1InSortedArrayOf0sAnd1s_1 {

	public static void main(String[] args) {
		int ar[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==1)
			{
				System.out.println(i);
				break;
			}
		}
		
		
	}
}
