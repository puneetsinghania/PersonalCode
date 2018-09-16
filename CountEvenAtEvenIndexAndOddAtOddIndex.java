
public class CountEvenAtEvenIndexAndOddAtOddIndex {

	public static void main(String[] args) {
		int[] ar={2,10,19,22,25,27};
		int counteven=0;
		int countodd=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0 && i%2==0)
			{
				counteven++;
			}
			else if(ar[i]%2!=0 && i%2!=0)
			{
				countodd++;
			}
		}
		System.out.println("CountEvenAtEvenIndex="+counteven);
		System.out.println("CountOddAtOddIndex="+countodd);
	}
}
