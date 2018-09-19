
public class RECURSION_PrintNTo1 {

	public static void main(String[] args) {
		print(5);
	}
	static void print(int n)
	{
		if(n==0) return;
		else if(n>0)
		{
		System.out.print(n+" ");
		print(n-1);
		}
	}
}
