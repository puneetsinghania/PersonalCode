
public class Segregate0and1WOHashmap {

	public static void main(String[] args) {
		
	int[] ar={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
	int count=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]==0)
			count++;
	}
	for(int j=0;j<count;j++)
	{
	ar[j]=0;
	}
	for(int k=count;k<ar.length;k++)
	{
		ar[k]=1;
	}
	
	for(int a:ar)
	{
		System.out.print(a+" ");
	}
	
	}
}
