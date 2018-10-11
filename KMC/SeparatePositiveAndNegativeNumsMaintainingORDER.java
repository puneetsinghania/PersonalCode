package KMC;

public class SeparatePositiveAndNegativeNumsMaintainingORDER {
//Working as expected
	public static void main(String[] args) {
		int ar[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		
		 int j=0;
		 for(int i=0;i<ar.length;i++)
		 {
			 if(ar[i]<0)
			 {
				 int temp=ar[i];
				 ar[i]=ar[j];
				 ar[j]=temp;
				 j++;
			 }
		 }
		 
		 int k=ar.length-1;
		 while(ar[k]>0)
		 {
			 k--;
		 }
		 int m=k+1;
		 int n=ar.length-1;
		 while(m<n)
		 {
			 int temp=ar[m];
			 ar[m]=ar[n];
			 ar[n]=temp;
			 m++;
			 n--;
		 }
		 
		   for(int l=0;l<ar.length;l++)
	        {
	        	System.out.print(ar[l]+" ");
	        }
	}
}
