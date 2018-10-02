package KMC;

public class MissingNumber1 {

	public static void main(String[] args) {
		int[] ar={1,2,4,6,3,7,8};
		
		for(int i=0;i<ar.length-1;i++)
		{
			boolean missing=true;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]+1==ar[j])
				{
					missing=false;
					break;
				}
			}
			if(missing==true)
				System.out.println(ar[i]+1);
			
		}
	}
}
