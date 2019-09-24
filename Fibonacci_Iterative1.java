
public class Fibonacci_Iterative1 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		int f1=0,f2=1;
		int f3;
		
		while(n>0)
		{
			System.out.print(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
	}

}
