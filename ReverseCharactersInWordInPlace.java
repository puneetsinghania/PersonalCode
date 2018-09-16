
public class ReverseCharactersInWordInPlace {

	public static void main(String[] args) {
		String str="Chitradurga is a fort city";
		
		char[] ar=str.toCharArray();
		int j=0;
		String st="";
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==' '||i==ar.length-1)
			{
				if(i==ar.length-1)
					j=i;
				else
					j=i-1;
				
				while(j>=0 && ar[j]!=' ')
				{
					st=st+ar[j];
					j--;
				}
				st=st+" ";
			}
		}
		System.out.println(st);
	}
}
