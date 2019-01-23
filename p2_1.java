import java.util.Arrays;


public class p2_1 {

	public static void main(String[] args) {
	
	int[] ar={-1, 3, 6, 2, 1, 7, 5, -4, 8, 0, 4, 9};
	int given=8;
	int count=0;
	Arrays.sort(ar);
	
	int l=0;
	int r=ar.length-1;
	while(l<r)
		{
		
		if(ar[l]+ar[r]==given)
			{
			System.out.println(ar[l]+","+ar[r]);
			count++;
			l++;
			r--;
			}
		else if(ar[l]+ar[r]>given)
			r--;
		else
			l++;
		
		}
	System.out.println("count==>"+count);
	
	}
}
