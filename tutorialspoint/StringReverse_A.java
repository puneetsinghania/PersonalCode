package tutorialspoint;

public class StringReverse_A {
	
	public static void main(String[] args) {
		String str = "abcdef";
		
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println("BEFORE=>"+str);
		System.out.println("AFTER=>"+reverse);
	}

}
