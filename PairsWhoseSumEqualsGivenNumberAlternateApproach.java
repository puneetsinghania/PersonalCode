import java.util.Arrays;
import java.util.List;

//Try again--not getting output
public class PairsWhoseSumEqualsGivenNumberAlternateApproach {

	public static void main(String[] args) {
		int[] ar={3,5,7,8,9};
		
		int givenNum=12;
		int index2=0;
		for(int i=0;i<ar.length;i++)
		{
			int finder=givenNum-ar[i];
			
			List list=Arrays.asList(ar);
			if(list.contains(finder))
			{
			index2=	list.indexOf(finder);
			System.out.println("("+ar[i]+","+ar[index2]+")");
			}
			
			
		}
	}
}
