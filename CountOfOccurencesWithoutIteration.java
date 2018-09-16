
public class CountOfOccurencesWithoutIteration {
	public static void main(String[] args) {
	String str="Babagoodhai";
	String strLower=str.toLowerCase();
	
	int length1=strLower.length();
	String strReplaced=strLower.replace("a","");
	int length2=strReplaced.length();
	
	int occur=length1-length2;	
	System.out.println(occur);
	
	}
	
	
}
