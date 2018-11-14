package CrackingTheCoding6th;

public class SearchAnElementInSortedAndRotatedArray {

	public static void main(String[] args) {
		 int ar[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
	     int key = 6; 
	        
	     bs(ar,0,ar.length-1,key);   
	}
	static void bs(int[] ar,int low,int high,int key)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			if(key==ar[mid])
			{
				System.out.println(mid);
			}
			
			else if(ar[low]<=ar[mid])
			{
				if(key>=ar[low] && key<=ar[mid])
				{
					 bs(ar,low,mid-1,key);  
				}
				else
				{
					bs(ar,mid+1,high,key); 
				}
			}
			else
			{
				if(key>=ar[mid] && key<=ar[high])
				{
					bs(ar,mid+1,high,key); 
				}
				else
				{
					bs(ar,low,mid-1,key); 
				}
			}
		}
		else
			return;
		
	}
}
