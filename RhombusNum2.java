public class RhombusNum2 {
	public static void main(String[] args) {
	int n=7,sp=n/2,st=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
			System.out.print(" ");	
			}
			for(int k=0;k<st;k++)
			{
				if(k==0||k==st-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i<n/2)
			{
				sp--;
				st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();
			
		}
	}
}
