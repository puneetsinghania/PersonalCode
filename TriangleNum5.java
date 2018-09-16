
public class TriangleNum5 {
	public static void main(String[] args) {
		int len=5,st=1,n=1;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<st;j++)
			{
				if(n>9)
					n=1;
				
				System.out.print(n+" ");
				n++;
			}
			st++;
			System.out.println();
		}
		
	}
}
