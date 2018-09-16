
public class Merge2SortedArraysInSortedForm {

	public static void main(String[] args) {
		int[] a={9,11,17,18};
		int[] b={2,10,12,15,17};
		int[] c=new int[a.length+b.length];
		
		int i=0,j=0;
		for(int k=0;k<c.length;k++)
		{
			if(i<a.length && j<b.length)
			{
				if(a[i]<b[j])
				{
					c[k]=a[i];
					i++;
				}
				else
				{
					c[k]=b[j];
					j++;
				}
				
				
			}
			else if(i<a.length)
			{
				c[k]=a[i];
				i++;
			}
			else if(j<b.length)
			{
				c[k]=b[j];
				j++;
			}
			
		}
			
		for(int l=0;l<c.length;l++)
		{
			System.out.print(c[l]+" ");
		}
	}
}
