package CrackingTheCoding6th;

import java.util.Arrays;

public class FindAPairOfElementsSwappingWhichMakesSumOf2ArraysSame {
	
	public static void main(String[] args) {
	     	int[] A = { 4, 1, 2, 1, 1, 2 };  
	        int[] B = { 3, 6, 3, 3 }; 
	        
	        findPair(A,B);
	}
	
	static void findPair(int[] A,int[] B)
	{
		Arrays.sort(A);
		Arrays.sort(B);
		
		int sum1=findSum(A);
		int sum2=findSum(B);
		
		int target=findTarget(sum1,sum2);
		if(target==0)
			return;
		
		int a=0;
		int b=0;
		while(a<A.length && b<B.length)
		{
			int diff=A[a]-B[b];
			if(diff==target)
			{
                System.out.println(A[a]+" "+B[b]); 
                break;
			}
			else if(diff<target)
				a++;
			else
				b++;
				
		}
	}
	
	static int findSum(int[] ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
	
	static int findTarget(int sum1,int sum2)
	{
		if((sum1-sum2)%2!=0)
			return 0;
		else
			return (sum1-sum2)/2;
	}

}
