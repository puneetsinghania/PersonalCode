package KMC;

public class MissingNumber3 {

	public static void main(String[] args) {
		int[] ar={1,2,4,6,3,7,8};
		
		int min=ar[0];
		for(int j=1;j<ar.length;j++)
		{
			if(ar[j]<min)
			{
				min=ar[j];
			}
		}
		//System.out.println(min);
		for(int i=min;i<=min+ar.length;i++)
		{
			boolean isMissing=true;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]==i)
				{
					isMissing=false;
					break;
				}
			}
			if(isMissing==true)
				System.out.println(i);
		}
	}
}
