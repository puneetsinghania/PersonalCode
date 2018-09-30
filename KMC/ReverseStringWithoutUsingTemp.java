package KMC;

public class ReverseStringWithoutUsingTemp {

	public static void main(String[] args) {
		String str="abc";
		
		for(int i=0;i<str.length();i++)
		{
			str=str.substring(1,str.length()-i)+str.substring(0,1)+str.substring(str.length()-i,str.length());
		}
		System.out.println(str);
	}
}
