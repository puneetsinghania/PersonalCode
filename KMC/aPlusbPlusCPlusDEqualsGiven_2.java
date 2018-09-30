package KMC;

import java.util.HashMap;
import java.util.Map;

public class aPlusbPlusCPlusDEqualsGiven_2 {

	public static void main(String[] args) {
	int ar[] = {10, 20, 30, 40, 1, 2};
	int given=91;
	
	Map<Integer,Pairs> map=new HashMap<Integer,Pairs>();
	for(int i=0;i<ar.length-1;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			map.put(ar[i]+ar[j],new Pairs(ar[i],ar[j]));
		}
	}
	
	for(int i=0;i<ar.length-1;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			int sum=ar[i]+ar[j];
			int temp=given-sum;
			if(map.containsKey(temp))
			{
				Pairs p=map.get(temp);
				if(p.first!=i && p.first!=j && p.second!=i && p.second!=j)
				{
					System.out.println(p.first+","+p.second+","+ar[i]+","+ar[j]);
					break;
				}
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