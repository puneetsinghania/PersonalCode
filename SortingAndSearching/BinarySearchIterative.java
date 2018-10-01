package SortingAndSearching;

public class BinarySearchIterative {

	public static void main(String[] args) {
		int[] ar={2,3,4,10,40};
		int low=0;
		int high=ar.length-1;
		int key=3;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(key<ar[mid])
			{
			high=mid-1;
			}
			else if(key>ar[mid])
			{
			low=mid+1;
			}
			else if(key==ar[mid])
			{
			System.out.println("FOUND at "+mid );
			break;
			}
		}
	}
}
