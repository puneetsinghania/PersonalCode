
public class RECURSION_BinarySearchToFindElement {

	public static void main(String[] args) {
		int ar[]={2,8,9,11,12,14,22,55};
		
		int index=binarySearch(ar,0,ar.length-1,14);
		if(index==-1)
			System.out.println("Not Present");
		else
			System.out.println("Present at index-->"+index);
	}
	static int binarySearch(int[] ar,int low,int high,int element)
	{
		if(low>high)
			return -1;
		else
		{
			int mid=(low+high)/2;
			if(ar[mid]==element)
				return mid;
			else if(element>ar[mid])
				return binarySearch(ar, mid+1, high, element);
			else
				return binarySearch(ar, low, mid-1, element);
			
		}
			
	}
}
