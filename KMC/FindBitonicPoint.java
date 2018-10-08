package KMC;

public class FindBitonicPoint {

	public static void main(String[] args) {
        int ar[] = {6, 7, 8, 11, 9, 5, 2, 1}; 

        binarySearchForBP(ar,0,ar.length-1);
	}
	static void binarySearchForBP(int[] ar,int low,int high)
	{
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(ar[mid]>ar[mid-1] && ar[mid]>ar[mid+1])
			{
				System.out.println(mid);
				break;
			}
			else if(ar[mid]>ar[mid-1] && ar[mid]<ar[mid+1])
				low=mid+1;
			else
				high=mid-1;
				
		}
		
		
	}
}
