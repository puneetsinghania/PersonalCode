
public class IsSpecial2DigitNumber {
	
	public static void main(String[] args) {
		int number=59;
		int num=number;
		
		int sum=((num/10) * (num%10)) + ((num/10) + (num%10));
		
		if(sum==number)
			System.out.println("Special 2 digit");
		else
			System.out.println("Not Special 2 digit");
		
	}

}
