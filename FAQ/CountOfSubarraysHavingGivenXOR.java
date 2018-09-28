package FAQ;

public class CountOfSubarraysHavingGivenXOR {

	public static void main(String[] args) {
		int[] ar={5, 6, 7, 8, 9};
		
		int givenXOR=5;
		int count=0;
		
		for(int i=0;i<ar.length;i++)
		{
			int xor=0;
			for(int j=i;j<ar.length;j++)
			{
				xor=xor^ar[j];
				
				if(xor==givenXOR)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
