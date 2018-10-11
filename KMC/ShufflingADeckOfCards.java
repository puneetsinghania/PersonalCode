package KMC;

import java.util.Random;

public class ShufflingADeckOfCards {

	public static void main(String[] args) {
		int ar[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 
                	23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 
                	44, 45, 46, 47, 48, 49, 50,51};
		
		Random rand=new Random();
		
		for(int i=0;i<ar.length;i++)
		{
			int r=i+rand.nextInt(ar.length-i);
			
			int temp=ar[i];
			ar[i]=ar[r];
			ar[r]=temp;
			
		}
		
		for(int j=0;j<ar.length;j++)
		{
			System.out.print(ar[j]+" ");
		}
	}
}
