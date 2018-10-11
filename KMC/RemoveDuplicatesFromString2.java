package KMC;

public class RemoveDuplicatesFromString2 {

	public static void main(String[] args) {
		String str= "geeksforgeeks";
		
		char[] ar=str.toCharArray();
		
		int index=0;
		for(int i=0;i<ar.length;i++)
		{
		int j=i+1;
			while(j<ar.length && ar[i]!=ar[j])
			{
				j++;
			}
			if(j==ar.length)
			{
				ar[index]=ar[i];
				index++;
			}
		}
		for(int k=0;k<index;k++)
		{
			System.out.print(ar[k]+" ");
		}
		
	}
}
