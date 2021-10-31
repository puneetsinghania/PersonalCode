package timbudemy;

import java.util.Scanner;

public class ReadingUserInputChallenge {
	
	public static void main(String[] args)
	{
		int count=1;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		//boolean hasNextInt= sc.hasNextInt();
		
		while(count<=10)
		{
				System.out.println("Enter number #"+count+":");
				boolean hasNextInt= sc.hasNextInt();
				if(!hasNextInt)
				{
					System.out.println("Invalid Number");
				}
				else {
					int num=sc.nextInt();
					sum+=num;
					count++;
				}
				sc.nextLine();
		}
		System.out.println("Sum="+sum);
		sc.close();
		
	}

}
