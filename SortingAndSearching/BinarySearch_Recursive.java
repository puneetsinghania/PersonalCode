package SortingAndSearching;

public class BinarySearch_Recursive {

	public static void main(String[] args) {
		int[] ar={2,3,4,10,40};
		int low=0;
		int high=ar.length-1;
		int key=3;
		binarySearch(ar,low,high,key);
	}
	static void binarySearch(int[] ar,int low,int high,int key)
	{
		if(low<=high)
		{
			int mid=(low+high)/2;
		
			if(key<ar[mid])
			{
			binarySearch(ar,low,mid-1,key);
			}
			else if(key>ar[mid])
			{
			binarySearch(ar,mid+1,high,key);
			}
			else if(key==ar[mid])
			{
			System.out.println("FOUND at "+mid );
			}
		}
		
	}
}
