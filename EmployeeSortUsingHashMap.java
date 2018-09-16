import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class EmployeeA{
	
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
	EmployeeA(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	 public String toString(){
	        return "id: "+this.id+"-- Name: "+this.name;
	    }
}
class NameCompA implements Comparator<EmployeeA>
{

	@Override
	public int compare(EmployeeA obj1, EmployeeA obj2) {
		return obj1.getName().compareTo(obj2.getName());
	}
	
}
public class EmployeeSortUsingHashMap{
	public static void main(String[] args) {
		
		HashMap<EmployeeA,String> map=new HashMap<>();
		map.put(new EmployeeA(76,"bb"),"AA");
		map.put(new EmployeeA(88,"aa"),"BB");
		
		Set<EmployeeA> set=map.keySet();
		List<EmployeeA> list=new ArrayList<>(set);
		Collections.sort(list,new NameCompA());
		
		for(EmployeeA e:list)
		{
			System.out.println(e);
		}
		
	}
	
	
}