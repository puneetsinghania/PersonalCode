public class PatternGood2 {
	public static void main(String[] args) {
	
		int n=1,len=4,st=1,sp=len-1;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++)
			{
				System.out.print(k);
				if(k!=n)
				{
					for(int l=0;l<st;l++)
					{
					System.out.print("*");
					}
				}
			}
			n++;
			sp--;
			System.out.println();
			
		}
		
	}
}
