
public class TriangleNum2 {

	public static void main(String[] args) {
	int len=6,n=1,st=1;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<st;j++)
			{
				
				if(n%2==0)
				System.out.print("0");
				else
				System.out.print("1");
				
				n++;
				
			}
			
			st++;
			System.out.println();
			
		}
		
	}
}
