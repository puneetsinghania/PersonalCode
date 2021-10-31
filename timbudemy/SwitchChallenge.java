package timbudemy;

public class SwitchChallenge {
	
	public static void main(String[] args)
	{
		char ch='B';
		
		switch(ch)
		{
		case 'A':case 'B':case 'C':case 'D':case 'E':
			System.out.println("Found "+ch);
			break;
		default:
			System.out.println("Not Found");
			break;
		}
	}

}
