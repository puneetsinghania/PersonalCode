package FAQ;

import java.util.Arrays;

public class MaxProdOfATriplet2 {

	public static void main(String[] args) {
		int ar[] = { 10, 3, 5, 6, 20 };
		
		Arrays.sort(ar);
		
		System.out.println(ar[ar.length-1]*ar[ar.length-2]*ar[ar.length-3]);
	}
}
