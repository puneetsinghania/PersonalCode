package CrackingTheCoding6th;

import java.util.ArrayList;
import java.util.Arrays;

public class K_Largest_Elements_In_Original_Order {
	
	public static void main(String[] args) {
		int ar[] = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0 };
		
		int k=5;
		ArrayList<Integer> list=new ArrayList<>();
		
		int ar2[]=new int[ar.length];
		int index=0;
		for(int a:ar)
		{
			ar2[index]=a;
			index++;
		}
		
		Arrays.sort(ar2);
		int count=0;
		for(int i=0;i<ar2.length;i++)
		{
			if(count<k)
			{
				list.add(ar2[i]);
				count++;
			}
		}
		for(int j=0;j<ar.length;j++)
		{
			if(list.contains(ar[j]))
				System.out.print(ar[j]+" ");
		}
		
	}

}
