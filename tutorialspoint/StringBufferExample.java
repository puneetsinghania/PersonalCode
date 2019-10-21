package tutorialspoint;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("World");
		sb.insert(0, "Puneet");
		
		System.out.println(sb);
	}

}
