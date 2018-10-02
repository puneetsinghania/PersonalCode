package FAQ;

public class ReplaceEveryArrayElementByMultiplicationOfPreviousAndNext {

	public static void main(String[] args) {
        int ar[] = {2, 3, 4, 5, 6}; 
        	
        int prev=ar[0];
        int cur=0;
        int next=0;
        ar[0]=ar[0]*ar[1];
        
        for(int i=1;i<ar.length-1;i++)
        {
        	cur=ar[i];
        	next=ar[i+1];
        	ar[i]=prev*next;
        	prev=cur;
        }
        
        ar[ar.length-1]=prev*ar[ar.length-1];
        
        for(int j=0;j<ar.length;j++)
        {
        	System.out.print(ar[j]+" ");
        }
	}
}
