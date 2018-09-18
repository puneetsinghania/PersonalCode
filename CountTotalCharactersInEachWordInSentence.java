
public class CountTotalCharactersInEachWordInSentence {
	
	public static void main(String[] args) {
		String str="I am very very bad boy who boozes lotsaaaaaa  ";
		
		String[] ar=str.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+"-->"+ar[i].length());
		}
	}
}
