package FAQ;

import java.util.HashMap;
import java.util.Map;

public class aPlusbEqualscPlusd {

	public static void main(String[] args) {
		int ar[] = {3, 4, 7, 1, 2, 9, 8};
		int sum=0;
		
		Map<Integer,Pairs> map=new HashMap<>();
		for(int i=0;i<ar.length-1;i++)
		{
			
			for(int j=i+1;j<ar.length;j++)
			{
				sum=ar[i]+ar[j];
				if(!map.containsKey(sum))
				{
					map.put(sum,new Pairs(ar[i],ar[j]));
				}
				else
				{
					Pairs p=map.get(sum);
					System.out.println(p.first+","+p.second+"-->"+ar[i]+","+ar[j]);
				}
			}
		}
	}
}


class Pairs
{
	int first;
	int second;
	Pairs(int first,int second)
	{
		this.first=first;
		this.second=second;
	}
}
