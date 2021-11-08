package timbudemy;

import java.util.Scanner;

public class ArraysChallenge {
	
	public static void main(String[] args)
	{
		int num=5;
		
		int[] arInput=getIntegers(num);
		
		int[] arrOutput = sortIntegers(arInput);
		
		printArray(arrOutput);
	}
	
	public static int[] sortIntegers(int[] arInput)
	{		
		int[] ar=new int[arInput.length];
		for(int i=0;i<arInput.length;i++)
		{
			ar[i]=arInput[i];
		}
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
				{
					//swap(ar[i],ar[j]);
					int temp= ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		return ar;
	}

	public static int[] getIntegers(int num) {
		
		int[] arInput = new int[num];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input numbers:");
		
		for(int i=0;i<arInput.length;i++)
		{
			arInput[i]=sc.nextInt();
		}
		
		sc.close();
		
		return arInput;
	}
	
	public static void printArray(int[] arrOutput)
	{
		//System.out.println("Output is::::::::");
		for(int i=0;i<arrOutput.length;i++)
		{
			System.out.println("Element "+i+" contents "+arrOutput[i]);
		}
	}
}
