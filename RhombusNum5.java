
public class RhombusNum5 {
	public static void main(String[] args) {
		int len=7,sp=len/2,st=1,n=1;
		
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
			
			else if(k<=(st/2) && k>0)
			{
				counter--;
				System.out.print(counter);
			}
			else if(k>(st/2) && k>0)
			{
				counter++;
				System.out.print(counter);
			}
			
			 }
			
			if(i<len/2)
			{
				n++;
				sp--;
				st=st+2;
			}
			else
			{
				n--;
				sp++;
				st=st-2;
			}
			System.out.println();
		}
	}
}
