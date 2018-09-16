
public class ReverseArrayInWithoutExtraArray {

	public static void main(String[] args) {
		int[] ar={23,45,56,89,28};
		
		int j=ar.length-1;
		for(int i=0;i<ar.length;i++)
		{
			if(i<=j)
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				j--;
			}
		}
		for(int k=0;k<ar.length;k++)
		{
			System.out.print(ar[k]+" ");
		}
	}
}
