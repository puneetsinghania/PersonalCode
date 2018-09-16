import java.util.Arrays;


public class SecondLargestShortcut {
	public static void main(String[] args) {
	int[] ar={5,6,9,1,0,8,2,9};
	/*1st Approach
	  Arrays.sort(ar);
	System.out.println(ar[ar.length-2]);*/
	
	/*2nd Approach*/
	int max1=0,max2=0;
	//for(int i=0;i<ar.length;i++)
	//{
		max1=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(max1<ar[i])
			{
				max2=max1;
				max1=ar[i];
			}
			else if(ar[i]>max2 && ar[i]!=max1)
			{
				max2=ar[i];
			}
		}
//	}
		System.out.println("1st max="+max1);
		System.out.println("2nd max="+max2);
	}
}
