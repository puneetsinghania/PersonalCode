package KMC;

public class MoveSpacesToBeginning {

	public static void main(String[] args) {
		String str="move these spaces to beginning";
		
		char[] ar=str.toCharArray();
		
		int j=ar.length-1;
		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]!=' ')
			{
				ar[j]=ar[i];
				j--;
			}
		}
		
		for(int k=j;k>=0;k--)
		{
			ar[k]=' ';
		}
		
		for(int i=0;i<ar.length;i++)
        {
        	System.out.print(ar[i]+" ");
        }
	
	}
}
