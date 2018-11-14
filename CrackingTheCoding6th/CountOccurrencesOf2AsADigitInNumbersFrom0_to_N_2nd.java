package CrackingTheCoding6th;

public class CountOccurrencesOf2AsADigitInNumbersFrom0_to_N_2nd {

	static int count=0;
	public static void main(String[] args) {
		int N=22;
		
		for(int i=0;i<=N;i++)
		{
			count2s(i);
		}
		
		System.out.println(count);
	}
	static void count2s(int num)
	{
		String str=Integer.toString(num);
		char[] ar=str.toCharArray();
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]=='2')
				count++;
		}
	}
}
