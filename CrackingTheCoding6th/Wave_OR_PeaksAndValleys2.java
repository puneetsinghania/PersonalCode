package CrackingTheCoding6th;

public class Wave_OR_PeaksAndValleys2 {
	
	public static void main(String[] args) {

		 int ar[] = {10, 90, 49, 2, 1, 5, 23};
		
		 for(int i=0;i<ar.length;i+=2)
		 {
			if(i+1<ar.length && ar[i]<ar[i+1]) 
			 swap(ar,i,i+1);
			 
			if(i-1>=0 && ar[i]<ar[i-1])
				swap(ar,i,i-1);
		 }
		 
		 for(int k=0;k<ar.length;k++)
		 {
			 System.out.print(ar[k]+" ");
		 }
		 
	}
	static void swap(int[] ar,int i,int j)
	{
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}

}
