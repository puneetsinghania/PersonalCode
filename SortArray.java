public class SortArray {

	public static void main(String[] args)
	{
		int ar[]={-1,2,7,9,1,6};
		
		int temp=0;
		int min=0;
		int minIndex=0;
		for(int i=0;i<ar.length;i++)
		{
			min=ar[i];
			minIndex=i;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<min)
				{
					min=ar[j];
					minIndex=j;
					
				}
			}
			temp=ar[i];
			ar[i]=ar[minIndex];
			ar[minIndex]=temp;
			
		}
		for(int a:ar)
		{
			System.out.println(a);
		}
		
	}
	
}
