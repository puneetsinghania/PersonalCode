package VVK;

import java.util.Arrays;

public class Segregate_0s_and_1s_A_DNF_Way {
	
	public static void main(String[] args) {
		
		int[] ar= {0,0,1,0,1,1,0,1};

		int l=0,mid=0;
		int h=ar.length-1;
		
		while(mid<=h)
		{
			switch(ar[mid])
			{
				case 0:
					//swap(ar[l],ar[mid]);
					int temp=ar[l];
					ar[l]=ar[mid];
					ar[mid]=temp;
					//
					l++;
					mid++;
					break;
				case 1:
					//swap(ar[mid],ar[h]);
					int temp2=ar[mid];
					ar[mid]=ar[h];
					ar[h]=temp2;
					//
					h--;
					break;
			}
		}
		
		
		System.out.println(Arrays.toString(ar));
	}

}
