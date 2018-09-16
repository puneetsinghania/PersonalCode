
public class EvenAndOddAverage {

	public static void main(String[] args) {
		int[] ar={2,10,19,22,25};
		int sumeven=0;
		int sumodd=0;
		int counteven=0;
		int countodd=0;
		
		for(int i=0;i<ar.length;i++)
		{
		if(ar[i]%2==0)
			{
			sumeven=sumeven+ar[i];
			counteven++;
			}
			
		else{
			sumodd=sumodd+ar[i];
			countodd++;
			}
		}
		System.out.println("EvenAverage="+(sumeven/counteven));
		System.out.println("OddAverage="+(sumodd/countodd));
	}
}
