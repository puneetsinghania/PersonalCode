package FAQ;

public class RemoveGivenElementFromArrayInPlace {

	public static void main(String[] args) {
		int[] ar={3, 1, 2,2,5, 9};
		int given = 2;
		int count=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=given)
			{
				ar[count]=ar[i];
				count++;
			}
			
		}
		for(int j=0;j<count;j++)
		{
			System.out.print(ar[j]+" ");
		}
	}
}
