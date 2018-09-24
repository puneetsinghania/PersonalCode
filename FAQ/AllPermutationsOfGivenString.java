package FAQ;

public class AllPermutationsOfGivenString {

	public static void main(String[] args) {
		String str="abc";

		permutations(str,0,str.length()-1);
		
	}
	
	static void permutations(String str,int l,int r)
	{
		if(l==r)
			System.out.println(str);
		
		for(int j=l;j<=r;j++)
		{
			str=swap(str,l,j);
			permutations(str, l+1, r);
			str=swap(str,l,j);
		}
		
	}
	static String swap(String str,int l,int r)
	{
		char[] ar=str.toCharArray();
		char temp=ar[l];
		ar[l]=ar[r];
		ar[r]=temp;
		return String.valueOf(ar);
	}
}
