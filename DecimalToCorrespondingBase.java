
public class DecimalToCorrespondingBase {
	
	public static void main(String[] args) {
		
		int num=259;
		int base=2;
		String res=convert(num,base);
		System.out.println(res);
	}
	
	public static String convert(int num,int base)
	{
		String st="";
		while(num>0)
		{
			int r=num%base;
			if(r>9)
			{
				st=(char)(55+r) +st;
			}
			else 
			{
				st=r+st;
			}
			
			num=num/base;
		}
		return st;
	}

}
