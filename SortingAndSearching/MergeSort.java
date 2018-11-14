package SortingAndSearching;

public class MergeSort {
	
	public static void main(String[] args) {
		int ar[] = {12, 11, 13, 5, 6, 7}; 
		
		sort(ar,0,ar.length-1);
		
		for(int k=0;k<ar.length;k++)
		{
			System.out.print(ar[k]+" ");
		}
		
	}
	
	public static void sort(int[] ar,int l,int h)
	{
		
		if(l<h)
		{
			int m=(l+h)/2;
			
			sort(ar,l,m);
			sort(ar,m+1,h);
			mergeboth(ar,l,m,h);
			
		}
		
	}
	
	public static void mergeboth(int[] ar,int l,int m,int h)
	{
		int sizeLeft=m-l+1;
		int sizeRight=h-m;
		
		int[] leftArray=new int [sizeLeft];
		int[] rightArray=new int [sizeRight];
		
		for(int i=0;i<sizeLeft;i++)
		{
			leftArray[i]=ar[l+i];
		}
		
		for(int j=0;j<sizeRight;j++)
		{
			rightArray[j]=ar[m+1+j];
		}
		
		int lindex=0,rindex=0;
		int finalIndex=l;
		
		while(lindex<sizeLeft && rindex<sizeRight)
		{
			if(leftArray[lindex]<=rightArray[rindex])
			{
				ar[finalIndex]=leftArray[lindex];
				finalIndex++;
				lindex++;
			}
			else
			{
				ar[finalIndex]=rightArray[rindex];
				finalIndex++;
				rindex++;
				
			}			
			
		}
		while(lindex<sizeLeft)
		{
			ar[finalIndex]=leftArray[lindex];
			lindex++;
			finalIndex++;
		}
		while(rindex<sizeRight)
		{
			ar[finalIndex]=rightArray[rindex];
			rindex++;
			finalIndex++;
		}
	}

}
