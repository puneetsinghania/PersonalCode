
public class DeleteElementFromGivenIndex {

	public static void main(String[] args) {
		int[] ar={53,78,89,67,72,98};
		int index=3;
		int[] newa=new int[ar.length-1];
		
		
		if(index<0 || index>ar.length)
		{
			System.out.println("NOT POSSIBLE");
		}
		int j=0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(i<index)
			{
				newa[j]=ar[i];
				j++;
			}
			else
			{
				newa[j]=ar[i+1];
				j++;
			}
			
		}
		for(int a:newa)
		{
		System.out.print(a+" ");	
		}
	}
}
