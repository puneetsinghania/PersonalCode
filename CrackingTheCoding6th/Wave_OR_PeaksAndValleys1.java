package CrackingTheCoding6th;

import java.util.Arrays;

public class Wave_OR_PeaksAndValleys1 {
	
	public static void main(String[] args) {
		
		 int ar[] = {10, 90, 49, 2, 1, 5, 23};
		
		 Arrays.sort(ar);
		 for(int i=0;i<ar.length-1;i+=2)
		 {
			 int temp=ar[i];
			 ar[i]=ar[i+1];
			 ar[i+1]=temp;
		 }
		 
		 for(int j=0;j<ar.length;j++)
		 {
			 System.out.print(ar[j]+" ");
		 }
		 
		
	}

}
