package KMC;

public class CheckIfArrayIsBitonicOrNot {

	public static void main(String[] args) {
		int[] ar={-3, 9, 11, 20, 17, 5, 1};
		
		int i=0;
		while(i<ar.length-1 && ar[i]<ar[i+1])
		{
			i++;
		}
		while(i<ar.length-1 && ar[i]>ar[i+1])
		{
			i++;
		}
		if(i==ar.length-1)
		{
			System.out.println("Array is BITONIC");
		}
		else
		{
			System.out.println("Not Bitonic");
		}
	}
}
