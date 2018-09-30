package KMC;

public class RecursivelyRemoveAdjacentCharactersIfDuplicate {

	public static void main(String[] args) {
		String str="azxxzzy";
		
		RemoveAd(str);
	}
	static void RemoveAd(String str)
	{
		String st="";
		char[] ar=str.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			int j=i;
			boolean wrong=false;
			while(ar[i]==ar[j])
			{
				
				if(j==ar.length-1)
				{
					wrong=true;
					break;
				}
				else if(j!=ar.length-1)
				{
				j++;
				}
			}
			if(i+1<ar.length && ar[i]==ar[i+1])
			{
				i=j;
			}
			if(wrong==false ||(wrong==true && i+1==ar.length))
			{
			st=st+ar[i];
			}
		}
		if(!st.equals(str) && st.length()!=1)
		{
			RemoveAd(st);
		}
		else
		{
			System.out.print(st);
		}
		
	}
}
