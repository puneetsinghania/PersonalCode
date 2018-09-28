
public class Swap2StringsWithoutUsing3rdVariable {

	public static void main(String[] args) {
		String str1="mango";
		String str2="apple";
		System.out.println("Before-->"+" str1="+str1+",str2="+str2);
		
		str1=str1+str2; 			//mangoapple
		str2=str1.substring(0,5);	//mango
		str1=str1.substring(5,str1.length()); //apple
		
		System.out.println("After--> "+" str1="+str1+",str2="+str2);
	}
}
