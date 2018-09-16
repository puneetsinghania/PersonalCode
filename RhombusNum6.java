
public class RhombusNum6 {

	public static void main(String[] args) {
		int len=7,sp=len-1,st=1,n=1;
		
		for(int i=0;i<len;i++)
		{
			
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			int counter=n;
			for(int k=0;k<st;k++)
			{
				if(k==0)
					System.out.print(counter);
				
				else if(k%2!=0 && k>0)
				System.out.print("*");
				
				else if(k%2==0 && k>0)
				{
					 counter++;
					 System.out.print(counter);
				}
				
			}
			
			
			if(i<len/2)
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
