package KMC;

public class FindIndexOfFirst1InSortedArrayOf0sAnd1s_2 {

	public static void main(String[] args) {
		int ar[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
		
		binarySearch(ar,0,ar.length-1);
	}
	
	static void binarySearch(int[] ar,int low,int high)
	{
		if(low>high)
			return;
		
		int mid=(low+high)/2;
		
		if(ar[mid]==1 && (mid==0 ||ar[mid-1]==0))
		{
		System.out.println(mid);	
		}
		else if(ar[mid]==1)
		{
			binarySearch(ar,low,mid-1);
		}
		else
		{
			binarySearch(ar,mid+1,high);
		}
	}
}
