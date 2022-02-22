
public class Swap1stAndLastCharacterInEveryWordInSentence {

	public static void main(String[] args) {
		String str="Jspiders and Qspiders";
		
		String[] ar=str.split(" ");
		String st="";
		
		for(int i=0;i<ar.length;i++)
		{
		
			char[] chArray=ar[i].toCharArray();
			char temp=chArray[0];
			chArray[0]=chArray[chArray.length-1];
			chArray[chArray.length-1]=temp;
		
			for(int j=0;j<chArray.length;j++)
			{
			st=st+chArray[j];
			}

			if(i!=ar.length-1)
				st=st+" ";
		}
		System.out.print(st);
	}
}
