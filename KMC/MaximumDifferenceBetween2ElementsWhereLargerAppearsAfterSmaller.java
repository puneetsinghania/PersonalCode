package KMC;

public class MaximumDifferenceBetween2ElementsWhereLargerAppearsAfterSmaller {

	public static void main(String[] args) {
		int ar[] = {1, 2, 90, 10, 110};
		int maxdiff=0;
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int diff=ar[j]-ar[i];
				if(diff>maxdiff)
				{
					maxdiff=diff;
				}
			}
		}
		System.out.println(maxdiff);
	}
}
