
public class SplitSentenceIntoWords {

	public static void main(String[] args) {
		String str="Jspiders and Qspiders";
		
		String[] ar=str.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" "+i);
		}
	}
}
