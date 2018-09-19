
public class ConvertNumberStringToInteger {

	public static void main(String[] args) {
		String st="123";
		
		char[] ar=st.toCharArray();
		int res=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>='0' && ar[i]<='9')
			{
			res=res*10+(ar[i]-48);
			}
			else
			{
				System.out.println("Wrong format");
				break;
			}
				
		}
		System.out.println(res+10);
		System.out.println(st+10);
	}
}
