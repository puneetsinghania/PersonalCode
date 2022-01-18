public class PatternGood2Alternate {
	public static void main(String[] args) {
	
		int n=5,st=1,sp=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			int p=1;
			for(int k=0;k<st;k++)
			{
				if(k%2!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(p);
					p++;
				}
			}
			st=st+2;
			sp--;
			System.out.println();
			
		}
		
	}
}
