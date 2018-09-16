public class ZigZagMergeTwoArrays {

	public static void main(String[] args) {
		
		int[] a={20,23,56};
		int[] b={59,86,78,23,58,22,33};
		int[] c=new int[a.length+b.length];
		
		int j=0,k=0;
		for(int i=0;i<c.length;)
		{
			if(j<a.length)
			{
			c[i]=a[j];
			i++;
			j++;
			}
			if(k<b.length)
			{
			c[i]=b[k];
			i++;
			k++;
			}
			
		}
		
		for(int l=0;l<c.length;l++)
		{
			System.out.print(c[l]+" ");
		}
	}
}
