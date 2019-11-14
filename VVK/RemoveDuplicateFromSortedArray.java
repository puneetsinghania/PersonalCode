package VVK;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		
		int[] ar= {1,2,2,3,3,3,4,4};
		
		int j=0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				ar[j]=ar[i];
				j++;
			}
		}
		ar[j]=ar[ar.length-1];
		j++;
		
		for(int k=0;k<j;k++)
		{
			System.out.print(ar[k]+" ");
		}
	}
}
