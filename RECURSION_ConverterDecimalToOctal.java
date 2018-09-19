
public class RECURSION_ConverterDecimalToOctal {

	public static void main(String[] args) {
		dtoo(16);
		
	}
	static void dtoo(int n)
	{
		if(n>0){
		dtoo(n/8);
		System.out.print(n%8);
		}
		
		
	}
}
