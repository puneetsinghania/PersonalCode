package VVK;

import java.util.Arrays;

public class RearrangeArraySuchThat_arr_j_becomes_i_if_arr_i_is_j_1 {
	
	public static void main(String[] args) {
		int[] ar= {1,4,0,3,2};
		
		int[] temp=new int[ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			temp[ar[i]]=i;
		}
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=temp[i];
		}
		
		System.out.println(Arrays.toString(ar));
	}

}
