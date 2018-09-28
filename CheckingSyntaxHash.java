import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class EmployeeB{
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	EmployeeB(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	 public String toString(){
	        return "id: "+this.id+"-- Name: "+this.name;
	    }
}

public class CheckingSyntaxHash {

	public static void main(String[] args) {
		 Map<String, Integer> map=new LinkedHashMap<String, Integer>(); //LinkedHashMap used so that we could maintain insertion order.
	       
	     map.put("Puneet",7204);
	     map.put("Rahul",1234);
	     map.put("Rahul",1234);
	     
	     Map<Integer,Integer> map2=new LinkedHashMap<Integer,Integer>();
	     map2.put(new Integer(7204),1);
	     map2.put(new Integer(1234),2);
	     map2.put(new Integer(1234),3);
	     
	     map2.put(1234,2);
	     map2.put(1234,3);
	     map2.put(1234,5);
	     
	     Set<EmployeeB> set=new HashSet<>();
			set.add(new EmployeeB(76,"bb"));
			set.add(new EmployeeB(88,"aa"));
			set.add(new EmployeeB(88,"aa"));
			
			
	     System.out.println(map);
	     System.out.println(map2);
	     System.out.println(set);
	}
}
