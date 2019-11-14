package VVK;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] ar= {2,5,7,11,12,15,20,30,34,36};
		int key=20;
		binarySearch(ar,0,ar.length-1,key);
	}
	
    static void binarySearch(int[] ar,int l,int h,int key) 
	{
		if(l<=h)
		{
			int mid=(l+h)/2;
			if(key==ar[mid]) 
			{
				System.out.println(mid);
			}
			else if(key<ar[mid])
				binarySearch(ar,l,mid-1,key);
			else
				binarySearch(ar,mid+1,h,key);
		}
		
		
	}

}
