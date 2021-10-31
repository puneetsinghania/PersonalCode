package timbudemy;

public class EvenNumberChallenge {
	
	public static void main(String[] args)
	{
		boolean isEven=isEvenNumber(8);
		System.out.println(isEven);
	}

	public static boolean isEvenNumber(int number)
	{
		if(number%2!=0)
			return false;
		
		return true;
	}
}
