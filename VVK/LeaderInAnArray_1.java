package VVK;

public class LeaderInAnArray_1 {
	
	public static void main(String[] args) {
		
		int[] ar= {15,16,3,2,6,1,4};
		int j=0;
		
		for(int i=0;i<ar.length;i++)
		{
			for(j=i+1;j<ar.length;j++)
			{
				if(ar[j]>=ar[i])
				{
					break;
				}
			}
			if(j==ar.length)
			{
				System.out.println(ar[i]+" is the Leader");
			}
				
		}
	}

}
