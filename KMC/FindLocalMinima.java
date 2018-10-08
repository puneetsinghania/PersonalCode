package KMC;

public class FindLocalMinima {

	public static void main(String[] args) {
		int ar[] = {9, 6, 3, 14, 5, 7, 4};
		
		for(int i=0;i<ar.length;i++)
		{
			if(i!=0 && i!=ar.length-1 && ar[i]<ar[i+1] && ar[i]<ar[i-1])
				System.out.print(ar[i]+" ");
			else if(i==0 && ar[i]<ar[i+1])
				System.out.print(ar[i]+" ");
			else if(i==ar.length-1 && ar[i]<ar[i-1])
				System.out.print(ar[i]+" ");
		}
	}
}
