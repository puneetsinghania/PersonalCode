
public class stairs {
	
	public static void main(String[] args) {
		int n=3,m=3;
		int c=count(n,m);
		System.out.println(c);
	}
	static int count(int n,int m)
	{
		return countA(n+1,m);
		//System.out.println(sum);
	}
	static int countA(int n,int m)
	{
		
		if(n<=1)
			return n;
		else
		{
			int res=0;
		for(int i=1;i<=m && i<=n;i++)
			{
			res=res+countA(n-i,m);
			}
		return res;
		}
		
	}

}
