package CrackingTheCoding6th;

public class TrappingRainWater {

	public static void main(String[] args) {

        int ar[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; 
        
        int l=0;
        int r=ar.length-1;
        int leftmax=0,rightmax=0;
        int sum=0;
        
        while(l<r)
        {
        	if(ar[l]<ar[r])
        	{
        		if(ar[l]>leftmax)
        		{
        			leftmax=ar[l];
        		}
        		else
        		{
        			sum=sum+(leftmax-ar[l]);
        		}
        		l++;
        	}
        	else
        	{
        		if(ar[r]>rightmax)
        		{
        			rightmax=ar[r];
        		}
        		else
        		{
        			sum=sum+(rightmax-ar[r]);
        		}
        		r--;
        	}
        }
        System.out.println(sum);
	}
}
