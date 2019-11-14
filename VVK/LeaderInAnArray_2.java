package VVK;

public class LeaderInAnArray_2 {
	
	public static void main(String[] args) {
		
		int[] ar= {15,16,3,2,6,1,4};
	
		int mfr=ar[ar.length-1];
		System.out.println("Leader is "+mfr);
		
		for(int i=ar.length-2;i>=0;i--)
		{
			if(ar[i]>mfr)
			{
				System.out.println("Leader is "+ar[i]);
				mfr=ar[i];
			}
		}
		
	}

}
