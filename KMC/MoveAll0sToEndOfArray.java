package KMC;

public class MoveAll0sToEndOfArray {

	public static void main(String[] args) {
        int ar[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 

        int j=0;
        for(int i=0;i<ar.length;i++)
        {
        	if(ar[i]!=0)
        	{
        		ar[j]=ar[i];
        		j++;
        	}
        }
        
        for(int k=j;k<ar.length;k++)
        {
        	ar[k]=0;	
        }
        
        for(int l=0;l<ar.length;l++)
        {
        	System.out.print(ar[l]+" ");
        }
	}
}
