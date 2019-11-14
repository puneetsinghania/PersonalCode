package VVK;

import java.util.Arrays;

public class Segregate_0s_1s_2s_DUTCH_NATIONAL_FLAG_WAY {
	
	public static void main(String[] args) {
		
		int[] ar= {0,1,1,0,1,2,1,2,0,0,0,1};
		
		int l=0,h=ar.length-1;
		int mid=0;
		
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
				mid++;
				break;
			case 2:
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
