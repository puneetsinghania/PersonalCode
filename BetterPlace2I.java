
public class BetterPlace2I {
	
	public static void main(String[] args) {

		int n=5;
		
		int f1=0;
		int f2=1;
		
		int f3=0;
		for(int i=3;i<=n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		System.out.print(f3);
		
	}

}
