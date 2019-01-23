
public class Soroco1 {

	public static void main(String[] args) {
	
	int S0=20;
	int S1=5;
	int n=0;
	
	//findNumberOf2s(S0);
	//findNumberOf5s(S1);
		
	
	int[] s=new int[n+1];
	int[] ss=new int[n+1];
	s[0]=findNumberOf2s(S0);
	s[1]=findNumberOf2s(S1);
	ss[0]=findNumberOf5s(S0);
	ss[1]=findNumberOf5s(S1);
	for(int i=2;i<=n;i++)
		{
		s[i]=s[i-1]+s[i-2];
		ss[i]=ss[i-1]+ss[i-2];
		}
	
	System.out.println(Math.min(s[n],ss[n]));
	
	
	}
	
	
	public static int findNumberOf2s(int number)
		{
		int c1=0;
		while(number%2==0)
		{
			number=number/2;
			c1++;
		}
		return c1;
		}
	public static int findNumberOf5s(int number)
		{
		int c2=0;
		while(number%5==0)
		{
			number=number/5;
			c2++;
		}
		return c2;
		}
	
}
	
