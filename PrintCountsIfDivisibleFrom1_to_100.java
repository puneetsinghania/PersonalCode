
public class PrintCountsIfDivisibleFrom1_to_100 {

	public static void main(String[] args) {
		
		int count1=0,count2=0,count3=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
				count1++;
			else if(i%3==0)
				count2++;
			else if(i%5==0)
				count3++;
		}
		System.out.println("Count1="+count1+" Count2="+count2+" Count3="+count3);
	}
}
