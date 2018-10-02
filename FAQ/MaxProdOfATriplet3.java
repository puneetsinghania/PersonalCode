package FAQ;

public class MaxProdOfATriplet3 {

	public static void main(String[] args) {
		int ar[] = { 10, 3, 5, 6, 20 };
		
		int max1=ar[0];
		int max2=0;
		int max3=0;
		for(int j=1;j<ar.length;j++)
		{
			if(ar[j]>max1)
			{
				max3=max2;
				max2=max1;
				max1=ar[j];
			}
			else if(ar[j]>max2 && ar[j]!=max1)
			{
				max3=max2;
				max2=ar[j];
			}
			else if(ar[j]>max3 && ar[j]!=max1 && ar[j]!=max2)
			{
				max3=ar[j];
			}
		}
		System.out.println(max1*max2*max3);
	}
}
