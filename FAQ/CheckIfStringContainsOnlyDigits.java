package FAQ;

public class CheckIfStringContainsOnlyDigits {

	public static void main(String[] args) {
		String str="123";
		boolean flag=false;
		
		char[] ar=str.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			if(!(ar[i]>='0' && ar[i]<='9'))
				flag=true;
		}
		if(flag==false)
		{
			System.out.println("Contains only digits");
		}
		else
		{
			System.out.println("Contains other characters too");
		}
	}
}
