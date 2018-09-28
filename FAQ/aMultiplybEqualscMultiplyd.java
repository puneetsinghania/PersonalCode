package FAQ;

import java.util.HashMap;
import java.util.Map;

public class aMultiplybEqualscMultiplyd {

	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int prod=0;
		
		Map<Integer,MPairs> map=new HashMap<>();
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				prod=ar[i]*ar[j];
				if(!map.containsKey(prod))
				{
					map.put(prod,new MPairs(ar[i],ar[j]));
				}
				else
				{
					MPairs p=map.get(prod);
					System.out.println(p.first+","+p.second+"-->"+ar[i]+","+ar[j]);
				}
			}
		}
		
	}
}

class MPairs
{
	int first;
	int second;
	MPairs(int first,int second)
	{
		this.first=first;
		this.second=second;
	}
}
