import java.util.ArrayList;
import java.util.List;


public class TestA1 {
	
public static void main(String[] args) {
	List<String> test = new ArrayList<String>();
	test.add("one");
	test.add("two");
	test.add("three");
	System.out.println(test);
	StringBuilder listString = new StringBuilder();

	for (String s : test){
	     listString.append("'"+s+"'"+",");
	     System.out.println("\n"+"listString="+listString+"\n"); 
	     System.out.println("s="+s+"\n"); 
	     System.out.println("test="+test+"\n"); 
	     
	     
	}
	StringBuffer sb = new StringBuffer();
	int size=test.size();
		for (Object lineList : test) {
			sb.append(lineList.toString());

			if (size > 1) {
				sb.append(",");

				size = size - 1;
			}
		}
		  System.out.println("\n"+"sb="+sb+"\n"); 

	
}
}
/*

}*/