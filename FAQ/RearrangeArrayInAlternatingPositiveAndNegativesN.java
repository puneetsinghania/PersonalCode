package FAQ;

public class RearrangeArrayInAlternatingPositiveAndNegativesN {

	public static void main(String[] args) {
		int[] ar={-5,-2,5,2,4,7,1,8,9,-8};
		
		int[] ar2=new int[ar.length];
		
		boolean negative=true;
		int j=0;
		for(int i=0;i<ar.length && j<ar.length;)
		{
			if(negative==true)	
			{
				if(ar[i]<0)
				{
					ar2[j]=ar[i];
					ar[i]=0;
					i=0;
					negative=false;
					j++;
				}
				else if(i==ar.length-1)
				{
					negative=false;
					i=0;
				}
				else
				{
					i++;	
				}
			}
		else if(negative==false)	
			{
				if(ar[i]>0)
				{
					ar2[j]=ar[i];
					ar[i]=0;
					i=0;
					negative=true;
					j++;
				}
				else if(i==ar.length-1)
				{
					negative=true;
					i=0;
				}
				else
				{
					i++;	
				}
			}
		
		
		}
		for(int k=0;k<ar2.length;k++)
		{
			System.out.print(ar2[k]+" ");
		}
	}
}
