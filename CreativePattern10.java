
public class CreativePattern10 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=n/2;j<n;j++)
			{
				if((j==n/2)||(i==j && i>=n/2)||(i+j==n-1 && i<=n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
	}
}
