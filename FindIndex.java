import java.util.Arrays;
import java.util.List;


public class FindIndex{

	public static void main(String[] args) {
		
		Integer ar[]={1, 2, 3, 6, 7, 11, 12, 15, 11};
		List list=Arrays.asList(ar);
		System.out.println(list.indexOf(11));
		System.out.println(list.lastIndexOf(11));
	}
}
