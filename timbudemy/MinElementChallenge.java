package timbudemy;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
	
	public static void main(String[] args)
	{
		int count=5;
		int[] numbers=readIntegers(count);
		int min = findMin(numbers);
		System.out.println("MIN="+ min);
	}

	public static int[] readIntegers(int count)
	{
		int[] ar=new int[count];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers:");
		for(int i=0;i<count;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		return ar;
	}
	
	public static int findMin(int[] numbers)
	{
		Arrays.sort(numbers);
		return numbers[0];
	}
}
