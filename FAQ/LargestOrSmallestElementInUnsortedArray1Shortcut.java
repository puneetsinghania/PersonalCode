package FAQ;

import java.util.Arrays;

public class LargestOrSmallestElementInUnsortedArray1Shortcut {

	public static void main(String[] args) {
		int[] ar={7, 10, 4, 3, 20, 15};
		
		Arrays.sort(ar);
		
		System.out.println("Largest element is-->"+ar[ar.length-1]);
		System.out.println("Smallest element is-->"+ar[0]);
		
	}
}
