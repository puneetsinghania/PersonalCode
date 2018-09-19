
public class SubstringPresentInMainString {

	public static void main(String[] args) {
		String st1="NalvadiKrishnaRajaKrishnaVadayarKrishna";
		String st2="Krishna";
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		char[] a=st1.toCharArray();
		char[] b=st2.toCharArray();
		boolean flag=false;
		int last=0;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			int k=i;
			int j=0;
			while(j<b.length && k<a.length && a[k]==b[j])
			{
				k++;
				j++;
			}
			if(j==b.length)
			{
				System.out.println(i);
				last=i;
				flag=true;
				count++;
				if(count==1)
					System.out.println("1st Occurence-->"+i);
			}
				
		}
			if(flag==true)
			System.out.println("Present "+count+" times"+" "+"at last occurence-->"+last);
			else
			System.out.println("Not Present");
	}
}
