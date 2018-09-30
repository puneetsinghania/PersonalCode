package KMC;

import java.util.Arrays;

public class aPlusbPlusCEqualsGiven {

	public static void main(String[] args) {
        int ar[] = { 1, 4, 45, 6, 10, 8 }; 
        int given=22;
        
        Arrays.sort(ar);
        
        for(int i=0;i<ar.length-1;i++)
        {
        	int j=i+1;
        	int k=ar.length-1;
        	
        	while(j<k){
        	if(ar[i]+ar[j]+ar[k]==given)
        	{
        		System.out.println(ar[i]+","+ar[j]+","+ar[k]);
        		break;
        	}
        	else if(ar[i]+ar[j]+ar[k]>given)
        		k--;
        	else
        		j++;
        	}
        }
	}
}
