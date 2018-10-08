package KMC;

public class NextNumberInTheSequenceImproved {
	
	static int nth=5;
	static String start="1";
	static int ncount=1;
	
	public static void main(String[] args) {
		
		String next=NextNumber(start,nth);
		System.out.println(next);
	}
	
	static String NextNumber(String start,int nth)
	{
		String st="";
		char[] ar=start.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			while(i!=ar.length-1 && ar[i]==ar[i+1])
			{
				count++;
				i++;
			}
			
			st=st+count+ar[i];
		}
		if(ncount<nth-1)
		{
			ncount++;
			return NextNumber(st,nth);
		}
		else
		{
			return st;
		}
	}
}
