
public class RECURSION_ConverterDecimalToBinary {

	public static void main(String[] args) {
		dtob(10);
		
	}
	static void dtob(int n)
	{
		if(n>0){
		dtob(n/2);
		System.out.print(n%2);
		}
		
		
	}
}
