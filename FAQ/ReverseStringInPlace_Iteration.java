package FAQ;

public class ReverseStringInPlace_Iteration {

	public static void main(String[] args) {
		String str = "Geeks for Geeks";
		
		char[] ar=str.toCharArray();
		int i=0;
		int j=ar.length-1;
		
		while(i<=j)
		{
			char temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<ar.length;k++)
		{
		System.out.print(ar[k]);
		}
		
	}
}
