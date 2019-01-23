
public class BetterPlace2R {

	public static void main(String[] args) {
		int n=50;
		int fib=fib(n+1);
		System.out.println(fib);
	}
	static int fib(int n)
	{
		if(n==1) return 0;
		else if (n==2) return 1;
		else
			return fib(n-1)+fib(n-2);
	}
}
