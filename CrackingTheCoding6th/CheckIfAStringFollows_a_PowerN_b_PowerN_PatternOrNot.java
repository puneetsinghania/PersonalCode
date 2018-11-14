package CrackingTheCoding6th;

public class CheckIfAStringFollows_a_PowerN_b_PowerN_PatternOrNot {
	
	public static void main(String[] args) {
		
		String str = "aabb";
		char[] ar=str.toCharArray();
		boolean flag=true;
		
		if(ar.length%2!=0)
			flag=false;
		
		int l=0;
		int r=ar.length-1;
		while(l<r)
		{
			if(ar[l]!='a' || ar[r]!='b' )
			{
				flag=false;
				break;
			}
			else
			{
				l++;
				r--;
			}
		}
		if(flag==true)
		{
			System.out.println("Matches");
		}
		else
		{
			System.out.println("Does Not Match");
		}
		
	}

}
