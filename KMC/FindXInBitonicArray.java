package KMC;

public class FindXInBitonicArray {
	public static void main(String[] args) {
		int ar[] = {-3, 9, 8, 20, 17, 5, 1};
		int X = 9;
		
		int bp=findBP(ar,0,ar.length-1);
		bitonicSearch(ar,bp,X);
		
	}
	static int findBP(int[] ar,int low,int high)
	{
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(ar[mid]>ar[mid-1] && ar[mid]>ar[mid+1])
			{
				return mid;
			}
			else if(ar[mid]>ar[mid-1] && ar[mid]<ar[mid+1])
				low=mid+1;
			else
				high=mid-1;
				
		}
		return -1;
	}
	static void bitonicSearch(int[] ar,int bp,int X)
	{
		if(X>ar[bp])
			return;
		else if(X==ar[bp])
			System.out.println(bp);
		else 
		{
			int result=ascendingSearch(ar,0,bp-1,X);
			if(result!=-1)
				System.out.println(result);
			else
			{
				result=descendingSearch(ar,bp+1,ar.length-1,X);	
				if(result!=-1)
				System.out.println(result);
				else 
				System.out.println("Not Found");
			}
		
		}
	}
	static int ascendingSearch(int[] ar,int low,int high,int X)
	{
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(X==ar[mid])
			{
				return mid;
			}
			else if(X>ar[mid])
			{
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return -1;
		
	}
	
	static int descendingSearch(int[] ar,int low,int high,int X)
	{
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(X==ar[mid])
				return mid;
			else if(X>ar[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
}
