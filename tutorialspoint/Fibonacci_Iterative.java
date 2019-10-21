package tutorialspoint;

import java.util.Arrays;

public class Fibonacci_Iterative {
	
	public static void main(String[] args) {
		
		int count=15; //upto N numbers
		
		int[] fib=new int[count];
		
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<count;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		
		System.out.println(Arrays.toString(fib));
	}

}
