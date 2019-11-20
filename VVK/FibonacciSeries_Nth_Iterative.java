package VVK;

public class FibonacciSeries_Nth_Iterative {
	
	public static void main(String[] args) {
		
		int fib1=0;
		int fib2=1;
		int nth=8;
		
		int fib3=0;
		
		for(int i=2;i<nth;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
		}
		System.out.println(fib3);
	}

}
