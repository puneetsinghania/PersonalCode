package KMC;

public class Merge1ArrayOfSize_N_IntoAnotherArrayOfSize_MplusN {

	public static void main(String[] args) {
		 int ar[] = {2, 8, -1, -1, -1, 13, -1, 15, 20}; 
	     int N[] = {5, 7, 9, 25};
	     
	     int i;
	     int j=ar.length-1;

		 //move valid elements to the end
	     for(i=ar.length-1;i>=0;i--)
	     {
	    	 if(ar[i]!=-1)
	    	 {
	    		 ar[j]=ar[i];
	    		 j--;
	    	 }
	     }

		 //display the elements just for testing
	     for(int m=0;m<ar.length;m++)
	     {
	    	 System.out.print(ar[m]+" ");
	     }
	     
	     System.out.println();

		 //merge the elements into m+n array in a sorted manner by comparing
	     int k=0;
	     i=(ar.length-N.length)-1;
    	 j=0;
	     while(k<ar.length)
	     {
	    	 
	    	 
	    	 if(i<ar.length && j<N.length && ar[i]<=N[j])
	    	 {
	    		 ar[k]=ar[i];
	    		 k++;
	    		 i++;
	    	 }
	    	 else
	    	 {
	    		 ar[k]=N[j];
	    		 j++;
	    		 k++;
	    	 }
	     }

		 //display the final list of elements
	     for(int l=0;l<ar.length;l++)
	     {
	    	 System.out.print(ar[l]+" ");
	     }

	}
}
