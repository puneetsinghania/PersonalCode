package FAQ;

public class LargestProductContiguousSubarray {

	public static void main(String[] args) {
		int [] ar = {-2, -3, 0, -2, -40};
		
		int product=1,maxprod=1,start=0,end=0;
		for(int i=0;i<ar.length;i++)
		{
			product=product*ar[i];
			if(product==0)
			{
				product=1;
				start=i+1;
			}
			else if(product>maxprod)
			{
				maxprod=product;
				end=i;
			}
		}
		System.out.println("Maxprod->"+maxprod);
		System.out.println("("+start+","+end+")");
	}
}
