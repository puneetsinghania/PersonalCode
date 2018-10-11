package SOLID;

public class Teacher extends Members{
	
	Teacher(int id,String name)
	{
		super(id,name);
	}
	
	public void teach()
	{
		System.out.println("Teaching");
	}
	
	public void work()
	{
		teach();
	}
}
