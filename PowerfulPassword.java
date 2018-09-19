
public class PowerfulPassword {

	public static void main(String[] args) {
		String str="Ba12ba!rt";
		
		int digits=0,uc=0,lc=0,special=0,space=0;
		char[] ar=str.toCharArray();
		if(ar.length<8)
			System.out.println("Password must be >= 8 characters");
		else if(ar.length>=8)
		{
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]>='0' && ar[i]<='9')
					digits++;
				else if(ar[i]>='A' && ar[i]<='Z')
					uc++;
				else if(ar[i]>='a' && ar[i]<='z')
					lc++;
				else if(ar[i]==' ')
					space++;
				else
					special++;
				
			}
			if(digits>0 && uc>0 && lc>0 && special>0 && space==0)
				System.out.println("Strong Password");
			else
				System.out.println("Weak Password");
			
		}
		
		
	}
}
