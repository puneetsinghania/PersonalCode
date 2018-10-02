package KMC;

public class ThreeElementsWhoseSumIsClosestToZero1 {
	
	public static void main(String[] args) {
		int ar[] = {1, 60, -10, 70, -80, 85};
		int given=0;
		int mindiff=Integer.MAX_VALUE;
		int minIndexI=0;
		int minIndexJ=0;
		int minIndexK=0;
		
		for(int i=0;i<ar.length-2;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				for(int k=j+1;k<ar.length;k++)
				{
					int sum=ar[i]+ar[j]+ar[k];
					int diff=Math.abs(sum-given);
					if(diff<mindiff)
					{
						mindiff=diff;
						minIndexI=i;
						minIndexJ=j;
						minIndexK=k;
					}
				}
			}
		}
		 System.out.println(mindiff+"--> "+ar[minIndexI]+","+ar[minIndexJ]+","+ar[minIndexK]);
		
	}

}
