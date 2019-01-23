import java.util.HashMap;
import java.util.Map;


public class Target {

	public static void main(String[] args) {
		
		//Map<Integer,String> map=new HashMap<>();
		Map<Integer, int[]> map = new HashMap<>();
		map.put(1, new int[] {8, 9, 10});
		map.put(2, new int[] {5,6});
		map.put(8, new int[] {7,4});
		System.out.println(map);
		
		
	}
	
    static void permute(int[] a, int k) 
    {
        if (k == a.length) 
        {
            for (int i = 0; i < a.length; i++) 
            {
                System.out.print(" [" + a[i] + "] ");
            }
            System.out.println();
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
}
