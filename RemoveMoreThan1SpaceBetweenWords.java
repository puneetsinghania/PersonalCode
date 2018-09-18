
public class RemoveMoreThan1SpaceBetweenWords {

	public static void main(String[] args) {
		String str="I  am  very   very   bad boy   ";
		
		char[] ar=str.toCharArray();
		
		String st="";
		int space=0;
		boolean wrong=false;
		for(int i=0;i<ar.length;i++)
		{
			while(ar[i]!=' ')
			{
				
				st=st+ar[i];
				i++;
				space=0;
			}
			int j=i;
			wrong=false;
			while(ar[j]==' ')
			{
				if(j!=ar.length-1)
					j++;
				else
				{
					wrong=true;
					break;
				}
			}
			space++;
			if(space==1 && wrong==false)
				st=st+ar[i];
			
		}
		System.out.print(st);
		System.out.print(".");
		
	}
}
