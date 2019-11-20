package Sigtuple;

import java.util.Arrays;
import java.util.Stack;

public class Sigtuple2 {
	
	public static void main(String[] args) {
		
		int[] ar= {4,5,2,25};
		//int[] ar= {25,20,15,5};
		int[] res=new int[ar.length];
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(0);
		int k=0;
		int i=0;
		for(i=1;i<ar.length;i++)
		{
			if(ar[i]> ar[s.peek()])
			{
				s.push(i);
				res[k]=ar[i];
				k++;
			}
			
		}
		if(i==ar.length && k!=0)
		{
			for(int j=k;k<res.length-1;k++)
			{
				res[k]=ar[s.peek()];
			}
			res[res.length-1]=-1;
		}
		else if(i==ar.length && k==0)
		{
			for(int j=k;k<res.length-1;k++)
			{
				res[k]=-1;
			}
			res[res.length-1]=-1;
		}
		
		System.out.println(Arrays.toString(res));
	}

}
