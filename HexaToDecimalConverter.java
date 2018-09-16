public class HexaToDecimalConverter {
	public static void main(String[] args) {
	
	String hex="23AC";
	char[] ar=hex.toCharArray();
	int mult=0;
	int sum=0;
	int d=16;
	int p=0;
	int count=countDigits(ar);
	//System.out.println(count);
	for(int i=ar.length-1;i>=0 && p<count;i--)
		{
		if(ar[i]>='A' && ar[i]<='F')
			mult=ar[i]-55;
		
		else if(ar[i]>='0' && ar[i]<='9')
			mult=ar[i]-48;
		
		sum=sum+mult*pow(d,p);
		//System.out.println(sum);
		p++;
		}
	System.out.println(sum);
	}
	
	static int pow(int d, int p) {
		int prod=1;
		 for(int i=0;i<p;i++)
		 {
			 if(p==0)return 1;
			 else
			prod=prod*d;
		  }
	return prod;
	 }

	static int countDigits(char ar[])
	{
		return ar.length;
	}
	
}
