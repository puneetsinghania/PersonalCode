package KMC;

public class MaxJminusI_WhereAR_J_Greater_AR_I {

	public static void main(String[] args) {
        int ar[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0}; 
        int maxdiff=0;
        
        for(int i=0;i<ar.length;i++)
        {
        	for(int j=ar.length-1;j>0;j--)
        	{
        		if(ar[j]>ar[i] && j-i>maxdiff)
        		{
        			maxdiff=j-i;
        		}
        	}
        }
        System.out.println(maxdiff);
	}
}
