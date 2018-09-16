import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SetOperationsOnArrays {
 
	public static void main(String[] args) {
		int a[]={28,32,45,56};
		int b[]={56,28,89,67,97};
		
		//A intersection B starts
		Map<Integer,Integer> mapAintersectionB=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			int ch=a[i];
			mapAintersectionB.put(ch,1);
		}
		for(int j=0;j<b.length;j++)
		{
			int ch=b[j];
			if(mapAintersectionB.containsKey(ch))
			{
			mapAintersectionB.put(ch,mapAintersectionB.get(ch)-1);
			}
		}
		Iterator<Integer> itr=mapAintersectionB.keySet().iterator();
		while(itr.hasNext())
		{
			int keyCo=itr.next();
			if(mapAintersectionB.get(keyCo)==0)
				System.out.print(keyCo+" ");
			
		}
		System.out.println();
		//A intersection B ends
		
		//A union B starts
				Map<Integer,Integer> mapAunionB=new LinkedHashMap<Integer,Integer>();
				for(int i=0;i<a.length;i++)
				{
					int ch=a[i];
					mapAunionB.put(ch,1);
				}
				for(int j=0;j<b.length;j++)
				{
					int ch=b[j];
					if(mapAunionB.containsKey(ch))
					{
						mapAunionB.put(ch,mapAunionB.get(ch)+1);
					}
					else if(!mapAunionB.containsKey(ch))
					{
						mapAunionB.put(ch,1);
					}
				}
				Iterator<Integer> itrunion=mapAunionB.keySet().iterator();
				while(itrunion.hasNext())
				{
					int keyCo=itrunion.next();
						System.out.print(keyCo+" ");
				}
				System.out.println();
			//A union B ends
				
			//A - B starts
				Map<Integer,Integer> mapAdiffB=new LinkedHashMap<Integer,Integer>();
				for(int i=0;i<a.length;i++)
				{
					int ch=a[i];
					mapAdiffB.put(ch,1);
				}
				for(int j=0;j<b.length;j++)
				{
					int ch=b[j];
					if(mapAdiffB.containsKey(ch))
					{
						mapAdiffB.put(ch,mapAdiffB.get(ch)-1);
					}
				}
				Iterator<Integer> itrAdiffB=mapAdiffB.keySet().iterator();
				while(itrAdiffB.hasNext())
				{
					int keyCo=itrAdiffB.next();
						if(mapAdiffB.get(keyCo)==1)
						System.out.print(keyCo+" ");
				}
				System.out.println();
			//A - B ends
				
			//B - A starts
				Map<Integer,Integer> mapBdiffA=new LinkedHashMap<Integer,Integer>();
				for(int i=0;i<b.length;i++)
				{
					int ch=b[i];
					mapBdiffA.put(ch,1);
				}
				for(int j=0;j<a.length;j++)
				{
					int ch=a[j];
					if(mapBdiffA.containsKey(ch))
					{
						mapBdiffA.put(ch,mapBdiffA.get(ch)-1);
					}
				}
				Iterator<Integer> itrBdiffA=mapBdiffA.keySet().iterator();
				while(itrBdiffA.hasNext())
				{
					int keyCo=itrBdiffA.next();
						if(mapBdiffA.get(keyCo)==1)
						System.out.print(keyCo+" ");
				}
				System.out.println();
			//B - A ends
		
	}
}
