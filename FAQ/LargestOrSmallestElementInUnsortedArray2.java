package FAQ;

public class LargestOrSmallestElementInUnsortedArray2 {

	public static void main(String[] args) {
		int[] ar={7, 10, 4, 3, 20, 15};
		
		int i=0;
		int min=ar[i];
		int minIndex=i;
		
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[j]>min) //For Largest
			//if(ar[j]<min)
			{
				min=ar[j];
				minIndex=j;
				
			}
		}
		System.out.println(min);
		System.out.println(minIndex);
	}
	
}
