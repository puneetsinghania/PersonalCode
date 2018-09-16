public class Rhombuspattern2 {
	public static void main(String[] args) {
		int n=7;
	int sp=0;
	int st=n;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<st;k++)
			{
				System.out.print("*");
			}
			if(i<n/2)
			{
				sp++;
				st=st-2;
			}
			else{
				sp--;
				st=st+2;
			}
		System.out.println();	
		}
		
	}
}
