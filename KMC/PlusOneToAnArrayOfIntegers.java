package KMC;

public class PlusOneToAnArrayOfIntegers {

	public static void main(String[] args) {
		int ar[]= {9,9,9};
		int res[]=plusOne(ar);
			
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	
	public static int[] plusOne(int[] ar)
	{
		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]<9)
			{
				ar[i]=ar[i]+1;
				return ar;
			}
		
			ar[i]=0;
		}
		int newarr[]=new int[ar.length+1];
		newarr[0]=1;
		return newarr;
	}
}
