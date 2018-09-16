import java.util.Arrays;

public class Merge2UnsortedArrayInSortedFormShortcut {

	public static void main(String[] args) {
		int[] a={3,1,7,2,5,13};
		int[] b={4,8,9,0,6,12,11};
		int[] c=new int[a.length+b.length];

		Arrays.sort(a);
		Arrays.sort(b);
		
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
