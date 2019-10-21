

import java.util.ArrayList;
import java.util.Iterator;

public class onlineTest {

	public static void main(String ...argv){
ArrayList<String> data=new ArrayList<String>();	
data.add("Test");
data.add("Test1");
data.add("Test2");

for(Iterator<String> iter=data.iterator();iter.hasNext();){
{
	String val=iter.next();
	if(val.equals("Test1"))
		iter.remove();
}
	}
	
	
	for(String val:data)
	{
		System.out.println(val);
	}
	}
}