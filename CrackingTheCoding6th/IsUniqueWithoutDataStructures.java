package CrackingTheCoding6th;

public class IsUniqueWithoutDataStructures {

	public static void main(String[] args) {
		String str="I am not bus";
		str=str.toLowerCase();
		boolean flag=false;
		
		char[] ar=str.toCharArray();
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=' ')
			{
				int j=i+1;
				while(ar[i]!=ar[j])
				{
					if(j!=ar.length-1)
						j++;
					else
						break;
				}
				if(ar[i]==ar[j])
				{
					flag=true;
					break;
				}
			}
			
		}
		if(flag==true)
		{
			System.out.println("Not Unique");
		}
		else
		{
			System.out.println("Unique");
		}
	}
}
