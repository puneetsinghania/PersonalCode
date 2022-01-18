
public class PatternGood1Alternate {
	public static void main(String[] args) {
	int n=5,st=1;
		
	for(int i=0;i<n;i++)
	{
		int p=1;
		for(int j=0;j<st;j++)
		{
			if(j%2!=0)
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
		System.out.println();
	}
	}
}
