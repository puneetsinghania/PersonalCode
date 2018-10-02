package FAQ;

public class MaxProdOfATriplet1 {

	public static void main(String[] args) {
		int ar[] = { 10, 3, 5, 6, 20 };
		
		int maxprod=0;
		for(int i=0;i<ar.length-2;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				for(int k=j+1;k<ar.length;k++)
				{
					int prod=ar[i]*ar[j]*ar[k];
					if(prod>maxprod)
					{
						maxprod=prod;
					}
				}
			}
		}
		System.out.println(maxprod);
	}
}
