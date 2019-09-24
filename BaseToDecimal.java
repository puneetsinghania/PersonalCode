
public class BaseToDecimal {
	
	public static void main(String[] args) {
		int base=16;
		String toConvert="23AC";
		
		String res=convert(toConvert,base);
		System.out.println(res);
	}
	
	public static String convert(String toConvert,int base)
	{

		char[] ar=toConvert.toCharArray();
		int i=ar.length-1;
		int pow=0;
		int sum=0;
		while(i>=0)
		{
			if(ar[i]>='a' && ar[i]<='f')
				sum=sum+(ar[i]-87)*power(base,pow);
			else if(ar[i]>='A' && ar[i]<='F')
				sum=sum+(ar[i]-55)*power(base,pow);
			else
				sum=sum+(ar[i]-48)*power(base,pow);
			
			pow++;
			i--;
		}
		
	
	return String.valueOf(sum);
	}
	
	public static int power(int num,int pow)
	{
		int powo=1;
		for(int i=1;i<=pow;i++)
		{
			powo=powo*num;
		}
		return powo;
	}

}
