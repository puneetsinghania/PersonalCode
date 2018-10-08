package KMC;

public class FirstAndLastPositionsOfAnElementInSortedArray {

	public static void main(String[] args) {
		int ar[] = {1, 3, 5, 5, 5, 5 ,67, 123, 125};
		int given=5;
		
		int count=0;
		int last=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==given)
			{
				if(count==0)
				{
					System.out.println("First occurence-->"+i);
				}
				else
				{
					last=i;
				}
				count++;
			}
		}
		System.out.println("Last occurence-->"+last);
		System.out.println("Total occurences-->"+count);
	}
}
