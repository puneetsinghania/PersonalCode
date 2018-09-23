package FAQ;

public class Merge2SortedArraysInPlace {

	public static void main(String[] args) {
		int a[] = {1, 5, 9, 10, 15, 20};
		int b[] = {2, 3, 8, 13};
		
		
		for(int i=b.length-1;i>=0;i--)
		{
			
			int last=a[a.length-1];
			int j;
			for(j=a.length-2;j>=0 && a[j]>b[i];j--)
			{
				a[j+1]=a[j];
			}
			if(last>b[i])
			{
				a[j+1]=b[i];
				b[i]=last;
			}
			
		}
		for(int l=0;l<a.length;l++){
		System.out.print(a[l]+" ");}
		
		System.out.println();
		
		for(int m=0;m<b.length;m++){
			System.out.print(b[m]+" ");}
		
	}
}
