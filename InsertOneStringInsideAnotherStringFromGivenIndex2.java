
public class InsertOneStringInsideAnotherStringFromGivenIndex2 {

	public static void main(String[] args) {
		
		String s1="Jspiders";
		String s2="Keshav";
		int index=3;
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		char[] c=new char[a.length+b.length];
		
		int i=0;
		while(i<index)
		{
			c[i]=a[i];
			i++;
		}
		int j=0;
		while(j<b.length)
		{
			c[i]=b[j];
			j++;
			i++;
		}
		j=index;
		while(j<a.length)
		{
			c[i]=a[j];
			i++;
			j++;
		}
		for(int l=0;l<c.length;l++)
		{
			System.out.print(c[l]);
		}
	}
}
