
public class InsertElementAtGivenIndex {

	public static void main(String[] args) {
		int[] ar={53,78,89,67,72,98};
		int index=3;
		int[] newa=new int[ar.length+1];
		int element=66;
		
		int j=0;
		if(index<0 || index>ar.length)
		{
			System.out.println("NOT POSSIBLE");
		}
		for(int i=0;i<ar.length;i++)
		{
			if(i<index)
			{
			newa[j]=ar[i];
			j++;
			}
			else
			{
				newa[j+1]=ar[i];
				j++;
				newa[index]=element;
			}
		}
		for(int a:newa)
		{
		System.out.print(a+" ");	
		}
	}
}
