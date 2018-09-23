package FAQ;

import java.util.Arrays;

public class nthLargestSmallestElementInUnsortedArray1Shortcut {

	public static void main(String[] args) {
		int[] ar={7, 10, 4, 3, 20, 15};
		
		int nth=4;
		Arrays.sort(ar);
		System.out.println("4th largest element is-->"+ar[ar.length-nth]);
		System.out.println("4th smallest element is-->"+ar[nth-1]);
	}
}
