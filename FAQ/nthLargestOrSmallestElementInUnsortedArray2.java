package FAQ;

public class nthLargestOrSmallestElementInUnsortedArray2 {
 
	public static void main(String[] args) {
		int[] ar={7, 10, 4, 3, 20, 15};
		
		int nth=4;
		int count=1;
		
		for(int i=0;i<ar.length-1;i++)
		{
			int min=ar[i];
			int minIndex=i;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]>min) //For nth Largest
				//if(ar[j]<min)
				{
					min=ar[j];
					minIndex=j;
				}
			}
			if(count<nth)
			{
				int temp=ar[i];
				ar[i]=ar[minIndex];
				ar[minIndex]=temp;
				count++;
			}
			else
			{
				System.out.println(ar[minIndex]);
				break;
			}
		}
		
	}
}
