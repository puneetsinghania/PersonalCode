package CrackingTheCoding6th;

public class OneAway {
	
	static int replaced=0;
	static int removed=0;
	static int added=0;
	
	public static void main(String[] args) {
		String strA="pale";
		String strB="ple";
		
		
		if(strA.length()-1==strB.length())
			Removed(strA,strB);
		else if(strA.length()+1==strB.length())
			Added(strA,strB);
		else if(strA.length()==strB.length())
			Replaced(strA,strB);
		else
			System.out.println("More than One Away");
		
	}
	
	static void Removed(String strA,String strB)
	{
		char[] ar1=strA.toCharArray();
		char[] ar2=strB.toCharArray();
		
		int j=0;
		int i=0;
		for(i=0;i<ar2.length;i++)
		{
			if(ar1[i]==ar2[j])
			{
				j++;
			}
			else
			{
				removed++;	
			}
				
		}
		if(removed==1||(i==j && removed==0))
			System.out.println("One Removal occured");
		else
			System.out.println("None Removal occured");
		
		
	}
	
	static void Added(String strA,String strB)
	{
		char[] ar1=strA.toCharArray();
		char[] ar2=strB.toCharArray();
		
		int j=0;
		int i=0;
		for(i=0;i<ar1.length;)
		{
			if(ar1[i]==ar2[j])
			{
				j++;
				i++;
			}
			else
			{
				added++;
				j++;
			}
		}
		if(added==1||(i==j && added==0))
			System.out.println("One Addition occured");
		else
			System.out.println("None Addition occured");
	}
	
	static void Replaced(String strA,String strB)
	{
		char[] ar1=strA.toCharArray();
		char[] ar2=strB.toCharArray();
		
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]!=ar2[i])
			{
				replaced++;
			}
		}
		if(replaced==1)
			System.out.println("One Replacement occured");
		else
			System.out.println("None Replacement occured");
	}
}
