import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

class Employee{
	
	int id;
	String name;
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
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	 public String toString(){
	        return "id: "+this.id+"-- Name: "+this.name;
	    }
}
class NameComp implements Comparator<Employee>
{

	@Override
	public int compare(Employee obj1, Employee obj2) {
		return obj1.getName().compareTo(obj2.getName());
	}
	
}
public class EmployeeSortUsingComparator{
	public static void main(String[] args) {
		
		TreeMap<Employee,String> map=new TreeMap<>(new NameComp());
		map.put(new Employee(76,"bb"),"AA");
		map.put(new Employee(88,"aa"),"BB");
		
		Iterator<Employee> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	
}