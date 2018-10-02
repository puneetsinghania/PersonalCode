package FAQ;

public class MaxProdOfATriplet4 {

	public static void main(String[] args) {
		int ar[] = { 10, 3, 5, 6, 20 };
		int prod=1;
		int count=0;
		
		for(int i=0;i<ar.length-1;i++)
		{
			int max=ar[i];
			int maxIndex=0;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]>max)
				{
					max=ar[j];
					maxIndex=j;
				}
			}
			if(count<3)
			{
				prod=prod*ar[maxIndex];
				int temp=ar[i];
				ar[i]=ar[maxIndex];
				ar[maxIndex]=temp;
				count++;
			}
			else
			{
				break;
			}
		}
		System.out.println(prod);
		
	}
}
