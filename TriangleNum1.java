
public class TriangleNum1 {
	public static void main(String[] args) {
	 int len=5,st=1;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<st;j++)
			{
				if(j%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			
			}
			st++;
			System.out.println();
			
		}
		
	}
}
