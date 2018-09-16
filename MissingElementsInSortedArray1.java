
public class MissingElementsInSortedArray1 {

	public static void main(String[] args) {
		int[] ar={28,32,45,56};
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int k=ar[i]+1;k<ar[i+1];k++)
			{
				System.out.print(k+" ");
			}
				
		}
		
	}
}
