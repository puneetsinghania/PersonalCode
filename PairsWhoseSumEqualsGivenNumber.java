
public class PairsWhoseSumEqualsGivenNumber {

	public static void main(String[] args) {
		int[] ar={3,5,7,8,9};
	
		int sum=0;
		int givenNum=12;
		for(int i=0;i<ar.length-1;i++)
		{
			
			for(int j=i+1;j<ar.length;j++)
			{
				
				sum=ar[i]+ar[j];
				if(sum==givenNum)
					System.out.println("("+ar[i]+","+ar[j]+")");
				
			}
			
			
		}
	
	
	}
}
