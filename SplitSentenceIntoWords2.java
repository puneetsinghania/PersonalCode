
public class SplitSentenceIntoWords2 {

	public static void main(String[] args) {
		String str="Jspiders  and Qspiders";
		
		char[] ar=str.toCharArray();
		String st="";
		String st2="";
		int space=0;
		
		for(int i=0;i<ar.length;i++)
		{
			while(ar[i]!=' ')
			{
				st=st+ar[i];
				space=0;
				if(i!=ar.length-1)
				{
					i++;
				}
				else
					break;
			}
			space++;
			if(space==1 && i!=ar.length-1)
				st=st+ar[i];
		}
		System.out.println(st);
		/*String[] splitArray=st.split(" ");
		for(int j=0;j<splitArray.length;j++)
		{
			System.out.println(splitArray[j]);
		}*/
		char[] splitting=st.toCharArray();
		for(int k=0;k<splitting.length;k++)
		{
			while(splitting[k]!=' ')
			{
				st2=st2+splitting[k];
				if(k!=splitting.length-1)
					k++;
				else
					break;
			}
			System.out.println(st2);
			st2="";
		}
		
		
	}
}
