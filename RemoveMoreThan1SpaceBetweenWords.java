
public class RemoveMoreThan1SpaceBetweenWords {

	public static void main(String[] args) {
		String str="  I  am  very   very   bad boy   ";
		
		char[] ar=str.toCharArray();
		
		String st="";
		int space=0;
		boolean wrong=true;
		boolean start= false;

		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=' ' && !start)
			{
				start=true;
			}
			if(ar[i]!=' ' && start)
			{
				st=st+ar[i];
				space=0;
				wrong=true;
			}
			if(ar[i]==' ' && start)
			{
				for(int j=i;j<ar.length;j++)
				{
					if(ar[j]!=' ')
					{
						wrong=false;
						break;
					}
				}
			}
			if(ar[i]==' ' && space<1 && !wrong && start)
			{
				st=st+ar[i];
				space++;
			}

		}
		System.out.print(st);
	}
}
