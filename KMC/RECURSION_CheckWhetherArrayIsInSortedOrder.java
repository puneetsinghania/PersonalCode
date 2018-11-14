package KMC;

public class RECURSION_CheckWhetherArrayIsInSortedOrder {

	public static void main(String[] args) {
		int[] ar={2,3,6,7};
		int j=ar.length-1;
		boolean res=sortedOrder(ar,j);
		if(res==true)
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");
	}
	static boolean sortedOrder(int[] ar,int j)
	{
		if(j==0)
			return true;
		else if(ar[j]<ar[j-1])
			return false;
		else 
			return sortedOrder(ar,j-1);

		
			
	}
}
