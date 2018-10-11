package KMC;

public class ReversalAlgoForArrayRotation {

	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 4, 5, 6, 7}; 
        int d=2;
        
        reverse(ar,0,d-1);
        reverse(ar,d,ar.length-1);
        reverse(ar,0,ar.length-1);
        
        for(int i=0;i<ar.length;i++)
        {
        	System.out.print(ar[i]+" ");
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
