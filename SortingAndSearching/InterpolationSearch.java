package SortingAndSearching;

public class InterpolationSearch {

	public static void main(String[] args) {
		int[] ar={10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
		
		int low=0;
		int high=ar.length-1;
		int key=18;
		while(low<=high && key>=ar[low] && key<=ar[high])
		{
			int pos=low + (((high-low) / 
	                  (ar[high]-ar[low]))*(key - ar[low]));
			
			if(key==ar[pos])
			{
				System.out.println("Found at "+pos);
				break;
			}
			else if(key>ar[pos])
				low=pos+1;
			else
				high=pos-1;
			
		}
	}
}
