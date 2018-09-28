package FAQ;

public class SubarrayWithSumEquals0_2 {

	public static void main(String[] args) {
		
	
	int[] ar={-3, 2, 3, 1, 6};
	
	boolean exists=false;
	
	for(int i=0;i<ar.length;i++)
	{
		int j=i+1;
		int sum=ar[i];
		while(sum!=0 && j<ar.length)
		{
			sum=sum+ar[j];
			j++;
		}
		if(sum==0){
			exists=true;
			break;
		}
	}
	if(exists==true)
		System.out.println("EXISTS");
	else
		System.out.println("DOES NOT EXIST");
	}
}
