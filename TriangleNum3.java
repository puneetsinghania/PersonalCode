
public class TriangleNum3 {

	public static void main(String[] args) {
		int len=5,st=1,n=1;
		
		for(int i=0;i<len;i++)
		{
			int ndiff=len-1;
			int k=n;
			for(int j=0;j<st;j++)
			{
				if(j==0)
				System.out.print(n+" ");
				else{
				k=k+ndiff;
				ndiff--;
				System.out.print(k+" ");
				}
			
				
			}
			n++;
			st++;
			System.out.println();
			
		}
	}
}
