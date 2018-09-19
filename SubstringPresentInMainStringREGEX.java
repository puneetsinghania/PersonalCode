import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SubstringPresentInMainStringREGEX {

	public static void main(String[] args) {
		String st1="NalvadiKrishnaRajaKrishnaVadayarKrishna";
		String st2="Krishna";
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		boolean flag=false;
		int count=0;
		int last=0;
		
		Pattern p=Pattern.compile(st2);
		Matcher m=p.matcher(st1);
		
		while(m.find())
		{
			flag=true;
			System.out.println(m.start());
			last=m.start();
			count++;
			if(count==1)
				System.out.println("1st Occurence-->"+m.start());
		}
		if(flag==true)
			System.out.println("Present "+count+" times"+" "+"at last occurence-->"+last);
		else
			System.out.println("Not Present");
	}
}
