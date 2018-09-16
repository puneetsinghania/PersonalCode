public class TrianglePattern1 {
	public static void main(String[] args) {
		int n=4;
	int sp=n-1;
	int st=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<st;k++)
			{
				System.out.print(st);
			}
			sp--;
			st++;
		System.out.println();	
		}
		
	}
}
