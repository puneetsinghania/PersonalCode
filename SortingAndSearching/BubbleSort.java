package SortingAndSearching;

public class BubbleSort {

	public static void main(String[] args) {
		int ar[] = {64, 34, 25, 12, 22, 11, 90};
		
		for(int i=0;i<ar.length-1;i++)
		{
			//boolean swapped=false;
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					//swapped=true;
				}
			}
			//if(swapped=false)
			//	break;
		}
		for(int k=0;k<ar.length;k++)
		{
		System.out.print(ar[k]+" ");
		}
	}
}
//Commented part is optimization to reduce comparisons