package KMC;

public class FirstRepeatedElement1 {

	public static void main(String[] args) {
		int[] ar={3,2,1,2,2,3};
		
		for(int i=0;i<ar.length-1;i++)
		{
			boolean repeated=false;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("First Repeated element="+ar[i]);
					repeated=true;
					break;
				}
			}
			if(repeated==true)
				break;
		}
	}
}
