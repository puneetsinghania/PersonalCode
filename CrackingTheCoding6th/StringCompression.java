package CrackingTheCoding6th;

public class StringCompression {

	public static void main(String[] args) {
		String str="aabcccccaaa";
		
		int count=1;
		String st="";
		char[] ar=str.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			if((i+1)<ar.length && ar[i]==ar[i+1])
				count++;
			else
			{
				st=st+ar[i]+count;
				count=1;
			}
			
		}
		if(st.length()<str.length())
			System.out.println(st);
		else
			System.out.println(str);	
	}
}
