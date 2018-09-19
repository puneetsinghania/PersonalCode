
public class Concat2StringsWithoutUsingPlus {

	public static void main(String[] args) {
		String s1="Jspiders";
		String s2="Keshav";
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		char[] c=new char[a.length+b.length];
		
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			c[j]=a[i];
			j++;
		}
		for(int k=0;k<b.length;k++)
		{
			c[j]=b[k];
			j++;
		}
		for(int l=0;l<c.length;l++)
		{
			System.out.print(c[l]);
		}
		
	}
}
