package KMC;

public class RecursivelyRemoveAdjacentCharactersIfDuplicate2 {

	public static void main(String[] args) {
		String st="azxxzzy";
		char[] str=st.toCharArray();
		RemoveAdjacentPairs(str);
	}
	static void RemoveAdjacentPairs(char[] str)
	{
		int j=0;
		for(int i=1;i<=str.length;i++)
		{
			while((j>=0) && (str[i]==str[j]))
			{
				i++;
				j--;
			}
			str[++j]=str[i];
		}
		return;
		
	}
}
