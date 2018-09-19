
public class CheckISBN {

	public static void main(String[] args) {
		String st="0201103311";
		
		char[] ar=st.toCharArray();
		int n=ar.length;
		int sum=0;
		
		if(ar.length!=10)
		{
			System.out.println("Not ISBN");
		}
		else
		{
		for(int i=0;i<ar.length;i++)
			{
			sum=sum+(ar[i]-48)*n;
			n--;
			}
		}
		if(sum%11==0)
			System.out.println("ISBN");
		else
			System.out.println("NOT ISBN");
			
	}
}
