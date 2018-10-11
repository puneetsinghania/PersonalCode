package KMC;

public class EquilibriumIndexOfArray {

	public static void main(String[] args) {
        int ar[] = { -7, 1, 5, 2, -4, 3, 0 }; 

        int sum=0;
        int leftsum=0;
        for(int i=0;i<ar.length;i++)
        {
        	sum=sum+ar[i];
        }
        for(int j=0;j<ar.length;j++)
        {
        	sum=sum-ar[j];
        	if(leftsum==sum)
        	{
        		System.out.println(j);
        		break;
        	}
        	else
        	{
        	leftsum=leftsum+ar[j];	
        	}
        }
	}
}
