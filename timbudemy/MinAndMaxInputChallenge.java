package timbudemy;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
	
	public static void main(String[] args)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter number:");
			if(sc.hasNextInt())
			{
				int number=sc.nextInt();
				if(number<min)
					min=number;
				if(number>max)
					max=number;
			}
			else
			{
				System.out.println("Invalid Number");
				break;
			}
			sc.nextLine();
		
		}
		
		System.out.println("MIN="+min);
		System.out.println("MAX="+max);
		sc.close();
	}

}
