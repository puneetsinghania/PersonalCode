
public class ReverseWordByWordInSentence {

	public static void main(String[] args) {
		
		String str="Chitradurga is a fort city";
		char[] ar=str.toCharArray();
		int j=0;
		String st="";
		
		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]==' '||i==0)
			{
				if(i==0)
					j=i;
				else
					j=i+1;
				
				while(j<ar.length && ar[j]!=' ')
				{
					st=st+ar[j];
					j++;
				}
				st=st+" ";
				
				
				
			}
			
		}
		System.out.println(st);
	}
}
