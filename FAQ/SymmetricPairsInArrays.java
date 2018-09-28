package FAQ;

import java.util.HashMap;
import java.util.Map;

public class SymmetricPairsInArrays {

	public static void main(String[] args) {
        int arr[][] = new int[5][2]; 
        arr[0][0] = 11; arr[0][1] = 20; 
        arr[1][0] = 30; arr[1][1] = 40; 
        arr[2][0] = 5;  arr[2][1] = 10; 
        arr[3][0] = 40;  arr[3][1] = 30; 
        arr[4][0] = 10;  arr[4][1] = 5; 
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
        	int first=arr[i][0];
        	int second=arr[i][1];
        	
        	Integer next=map.get(second);
        	
        	if(next!=null && next==first)
        	{
        		System.out.println(first+","+second);
        	}
        	else
        	{
        		map.put(first,second);
        	}
        	
        }
	}
}
