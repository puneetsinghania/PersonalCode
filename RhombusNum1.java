
public class RhombusNum1 {
	public static void main(String[] args) {
	int n=7,sp=n/2,elem=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			int k2=elem/2+1;
			for(int k=0;k<elem;k++)
			{
				System.out.print(k2);
				if(k<elem/2)
				k2--;
				else
				k2++;	
			}
		
			if(i<n/2)
			{
				sp--;
				elem=elem+2;
			}
			else
			{
				sp++;
				elem=elem-2;
			}
			System.out.println();
		}
		
	}
}
