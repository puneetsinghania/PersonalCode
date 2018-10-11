package ImmutableClass;

import java.util.HashMap;

public final class ImmutableClass {

	private final int id;
	private final String name;
	private final HashMap<String,String> map;
	
	public ImmutableClass(int id,String name,HashMap<String,String> map) {
		this.id=id;
		this.name=name;
		this.map=new HashMap<String,String>(map);
		
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public HashMap<String,String> getMap()
	{
		return (HashMap<String,String>) map.clone();
	}
	
	
	public static void main(String[] args)
    {
        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("1", "first");
        h1.put("2", "second");

        String s = "original";

        int i = 10;

        ImmutableClass ce = new ImmutableClass(i, s, h1);

        // Lets see whether its copy by field or reference
        System.out.println(s == ce.getName());
        System.out.println(h1 == ce.getMap());
        // print the ce values
        System.out.println();
        
        System.out.println("ce id:" + ce.getId());
        System.out.println("ce name:" + ce.getName());
        System.out.println("ce testMap:" + ce.getMap());
        
        System.out.println();
        // change the local variable values
        i = 20;
        s = "modified";
        h1.put("3", "third");
        // print the values again
        System.out.println("ce id after local variable change:" + ce.getId());
        System.out.println("ce name after local variable change:" + ce.getName());
        System.out.println("ce testMap after local variable change:" + ce.getMap());
        
        System.out.println();
        
        HashMap<String, String> hmTest = ce.getMap();
        hmTest.put("4", "new");

        System.out.println(
                "ce testMap after changing variable from accessor methods:" + ce.getMap());

    }
}
