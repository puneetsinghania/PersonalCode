
public class PatternGood1 {
	public static void main(String[] args) {
	int len=4,n=1,st=1;
		
	for(int i=0;i<len;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(j);
			if(j!=n){
				for(int k=0;k<st;k++)
				{
					System.out.print("*");
				}
					}
		}
		n++;
		System.out.println();
		
	}
		
	}
}
