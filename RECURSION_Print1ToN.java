
public class RECURSION_Print1ToN {

	public static void main(String[] args) {
		print(5);
	}
	static void print(int n)
	{
		if(n>1)
			print(n-1);
		
		System.out.print(n+" ");
		
	}
}
