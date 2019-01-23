public class BetterPlace4 {

	public static void main(String[] args) {
		int n=3;
		int st=1,sp=n-1;
		for(int k=0;k<n;k++)
		{
			for(int j=0;j<sp;j++)
			{
			System.out.print(" ");
			}
			for(int i=0;i<st;i++)
			{
			System.out.print("#");
			}
		System.out.println();
		st=st+2;
		sp=sp-1;
		}
	
	}
}
