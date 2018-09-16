import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Substringwith5thIndex {
	public static void main(String[] args) {
		String str="helloslkhellodjladfjhello";
		Pattern p=Pattern.compile("hello");
		Matcher m=p.matcher(str);
		int count=0;
		while(m.find())
		{
			count++;
			if(count==3)
				System.out.println(m.start());
		}
		//System.out.println(count);
	}
}
