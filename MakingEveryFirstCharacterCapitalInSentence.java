
public class MakingEveryFirstCharacterCapitalInSentence {

	public static void main(String[] args) {
		String str="raMA AND LaXMANA";
		
		String st="";
		str=str.toLowerCase();
		String[] ar=str.split(" ");
		
		for(int i=0;i<ar.length;i++)
		{
			char[] chArray=ar[i].toCharArray();
			for(int j=0;j<chArray.length;j++)
			{
				if(j==0)
				{
					chArray[j]=(char)(chArray[j]-32);
				}
				st=st+chArray[j];
			}

			if(i!=ar.length-1)
				st=st+" ";
			
		}
	
			System.out.print(st);	
		
		
	}
}
