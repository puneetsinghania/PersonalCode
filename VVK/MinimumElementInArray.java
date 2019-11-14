package VVK;

public class MinimumElementInArray {
	
	public static void main(String[] args) {
		int[] ar= {5,3,8,2,1,9,4};
		
		int min=ar[0];
		
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<min)
				min=ar[i];
		}
		
		System.out.println(min);
	}

}
