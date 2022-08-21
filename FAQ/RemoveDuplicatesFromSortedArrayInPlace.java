package FAQ;

public class RemoveDuplicatesFromSortedArrayInPlace {

	public static void main(String[] args) {
		int[] ar={1, 2, 2, 3, 4, 4, 4, 5, 5};
		
		int count=0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				ar[count]=ar[i];
				count++;
			}
			
		}
		ar[count]=ar[ar.length-1];
		count++;

		for(int j=0;j<count;j++)
		{
			System.out.print(ar[j]+" ");
		}
		
	}
}
