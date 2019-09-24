
public class Fibonacci_Iterative2 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		int f1=0;
		System.out.print(f1+" ");
		
		int f2=1;
		System.out.print(f2+" ");
		
		int f3;
		int count=n-2;
		while(count<=n)
		{
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			count++;
		}
	}

}
