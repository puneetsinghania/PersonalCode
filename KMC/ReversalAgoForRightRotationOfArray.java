package KMC;

public class ReversalAgoForRightRotationOfArray {

	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int d = 3; 
		
		reverse(ar,ar.length-d,ar.length-1);
		reverse(ar,0,ar.length-d-1);
		reverse(ar,0,ar.length-1);
		
		for(int l=0;l<ar.length;l++)
        {
        	System.out.print(ar[l]+" ");
        }
	      
	}
	
	static void reverse(int[] ar,int start,int end)
	{
		while(start<end)
		{
			int temp=ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
		}
	}
}
