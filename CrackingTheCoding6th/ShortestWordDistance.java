package CrackingTheCoding6th;

public class ShortestWordDistance {

	public static void main(String[] args) {
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "coding";
		String word2 = "practice";
		int d1=-1,d2=-1;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(word1))
			{
				d1=i;
				if(d2!=-1)
				{
					min=Math.min(min,d1-d2);
				}
			}
			if(words[i].equals(word2))
			{
				d2=i;
				if(d1!=-1)
				{
					min=Math.min(min,d2-d1);
				}
			}
		}
		System.out.println(min);
	}
}
