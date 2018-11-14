package CrackingTheCoding6th;

public class CountOccurrencesOf2AsADigitInNumbersFrom0_to_N_1st {

	static int count=0;
	public static void main(String[] args) {
		int N=100;
		
		for(int i=0;i<=N;i++)
		{
			count2s(i);
		}
		
		System.out.println(count);
	}
	static void count2s(int num)
	{
		while(num>0)
		{
			if(num%10==2)
			{
				count++;
			}
			num=num/10;
		}
	}
}
