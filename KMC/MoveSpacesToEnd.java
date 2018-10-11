package KMC;

public class MoveSpacesToEnd {

	public static void main(String[] args) {
		String str="move these spaces to end";
		
		char[] ar=str.toCharArray();
		
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=' ')
			{
				ar[j]=ar[i];
				j++;
			}
		}
		for(int k=j;k<ar.length;k++)
		{
			ar[k]=' ';
		}
		
		for(int l=0;l<ar.length;l++)
        {
        	System.out.print(ar[l]+" ");
        }
	}
}
