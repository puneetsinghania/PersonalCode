
public class CountWordsPresentInSentence2 {

	public static void main(String[] args) {
		String str="Chitradurga is a fort city wahha";
		
		int words=0;
		char[] ar=str.toCharArray();
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==' ' || i==ar.length-1)
			{
				words++;
			}
			
		}
		System.out.println(words);
	}
}
