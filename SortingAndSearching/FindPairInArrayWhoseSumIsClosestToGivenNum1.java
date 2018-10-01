package SortingAndSearching;

public class FindPairInArrayWhoseSumIsClosestToGivenNum1 {

	public static void main(String[] args) {
        int ar[] =  {10, 22, 28, 29, 30, 40}; 
        int given = 54;
        int minIndexI=0,minIndexJ=0;
        
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<ar.length-1;i++)
        {
        	for(int j=i+1;j<ar.length;j++)
        	{
        		int sum=ar[i]+ar[j];
        		int diff=Math.abs(given-sum);
        		if(diff<mindiff)
        		{
        			mindiff=diff;
        			minIndexI=i;
        			minIndexJ=j;
        		}
        	}
        }
        System.out.println(mindiff+"--> ("+ar[minIndexI]+","+ar[minIndexJ]+")");

	}
}
