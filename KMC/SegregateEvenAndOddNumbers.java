package KMC;

public class SegregateEvenAndOddNumbers {

	public static void main(String[] args) {
		int ar[] = { 12, 10, 9, 45, 2, 10, 10, 45 }; 
		
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				j++;
			}
		}
		for(int k=0;k<ar.length;k++)
		{
			System.out.print(ar[k]+" ");
		}
		
	}
}
