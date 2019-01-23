import java.util.*;

public class Tester
{
	public static void main(String[] args) {

		String s1="java";
		String s2="java";
		String s3="JAVA";
		s2.toUpperCase();
		s3.toUpperCase();
		boolean b1= s1==s2;
		boolean b2= s1==s3;
		System.out.print(b1);
		System.out.print(" "+b2);
	}
	
}