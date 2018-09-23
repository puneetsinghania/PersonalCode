package FAQ;

public class ReverseArrayWithoutAffectingSpecialCharacters {

	public static void main(String[] args) {
		String str="Ab,c,de!$";
		
		char[] ar=str.toCharArray();
		
		int j=ar.length-1;
		for(int i=0;i<ar.length;)
		{
			if(i<=j)
			{
				if((ar[i]>='a' && ar[i]<='z'||ar[i]>='A' && ar[i]<='Z')&&(ar[j]>='a' && ar[j]<='z'||ar[j]>='A' && ar[j]<='Z'))
				{
					char temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					j--;
					i++;
				}
				 if(!(ar[i]>='a' && ar[i]<='z'||ar[i]>='A' && ar[i]<='Z'))
					i++;
				 if(!(ar[j]>='a' && ar[j]<='z'||ar[j]>='A' && ar[j]<='Z'))
					j--;
		
			}
			else
				break;
		}
		for(int k=0;k<ar.length;k++)
		{
			System.out.print(ar[k]);
		}
	}
}
