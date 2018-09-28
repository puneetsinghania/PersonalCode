package FAQ;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementsInEveryWindowOfSizeK {

	public static void main(String[] args) {
		 int ar[] = {1, 2, 1, 3, 4, 2, 3};  
		 int k = 4;
		 
		 Map<Integer,Integer> map=new HashMap<>();
		 for(int i=0;i<ar.length;i++)
		 {
			 int count=0;
			 for(int j=i;j<i+k && i+k<=ar.length;j++)
			 {
				 int ch=ar[j];
				 if(!map.containsKey(ch))
				 {
					 map.put(ch,1); 
					 count++;
				 }
				 else
				 {
					 map.put(ch,map.get(ch)+1);
				 }
			 }
			 if(i+k>ar.length)
			 {
				 break;
			 }
			 else
			 {
			System.out.println(count);
			map.clear();
			 }
		 }
	}
}
