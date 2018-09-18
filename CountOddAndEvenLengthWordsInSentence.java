
public class CountOddAndEvenLengthWordsInSentence {

	public static void main(String[] args) {
		String str="I am great baby boy";
		
		String[] ar=str.split(" ");
		int even=0,odd=0;
		
		for(int i=0;i<ar.length;i++)
		{
			char[] chArray=ar[i].toCharArray();
			if(chArray.length%2==0)
				even++;
			else
				odd++;	
		}
		System.out.println("Total even length words="+even);
		System.out.println("Total odd length words="+odd);
	}
}
