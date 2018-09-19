
public class RECURSION_ConverterDecimalToHexadecimal {

	public static void main(String[] args) {
		dtoh(16);
		
	}
	static void dtoh(int n)
	{
		if(n>0){
		dtoh(n/16);
		if(n%16>9)
			{
			System.out.print((char)(n%16)+55);
			}
		else
			{
			System.out.print(n%16);
			}
		}
		
		
	}
}
