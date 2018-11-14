package CrackingTheCoding6th;

public class SubSort {
	
	public static void main(String[] args) {
	
		 int ar[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60}; 
		 
		 int min=Integer.MAX_VALUE;
		 int max=0;
		 int start=0;
		 int end=0;
		 
		 for(int i=0;i<ar.length-1;i++)
		 {
			 if(ar[i+1]<ar[i])
			 {
				 start=i+1;
				 break;
			 }
		 }
		 for(int j=ar.length-1;j>0;j--)
		 {
			 if(ar[j-1]>ar[j])
			 {
				 end=j-1;
				 break;
			 }
		 }
		 
		 for(int k=start;k<=end;k++)
		 {
			 if(ar[k]<min)
				 min=ar[k];
			 
			 if(ar[k]>max)
				 max=ar[k];
			 
		 }
		 
		 for(int l=0;l<start;l++)
		 {
			 if(ar[l]>min)
			 {
				 start=l;
				 break;
			 }
		 }
		 for(int m=ar.length-1;m>=end;m--)
		 {
			 if(ar[m]<max)
			 {
				 end=m;
				 break;
			 }
		 }
		 System.out.println("Between the indices "+start+" and "+end); 
	}

}
