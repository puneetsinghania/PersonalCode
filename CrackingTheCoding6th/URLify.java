package CrackingTheCoding6th;

public class URLify {

	public static void main(String[] args) {
		String str="Mr John Smith   Baba";
		
		String st="";
		char[] ar=str.toCharArray();
		
		for(int i=0;i<ar.length;i++)
		{
			while(ar[i]!=' ')
			{
				st=st+ar[i];
				if(i!=ar.length-1)
					i++;
				else
					break;
			}
			int j=i;
			boolean wrong =false;
			int count=0;
			while(ar[j]==' ')
			{
				count++;
				if(count>1)
					i++;
				if(j!=ar.length-1)
					j++;
				else
				{
					wrong=true;
					break;
				}
			}
			if(wrong==false && i!=ar.length-1)
				st=st+"%20";
		}
		System.out.println(st);
	}
}
