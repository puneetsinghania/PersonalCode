package VVK;

public class MaximumElementInArray {
	
	public static void main(String[] args) {
	
		int[] ar= {5,2,8,3,1,9,4};
		
		int max=ar[0];
		
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>max)
				max=ar[i];
		}
		System.out.println(max);
	}

}
