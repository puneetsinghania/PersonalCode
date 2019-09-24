
public class PowerOfANumber {

	public static void main(String[] args) {
		int num=5;
		int p=4;
		
		int pow=1;
		for(int i=1;i<=p;i++)
		{
			pow=pow*num;
		}
		System.out.println(pow);
	}
}
