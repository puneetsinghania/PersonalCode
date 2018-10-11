package SOLID;

public abstract class Members {

	int id;
	String name;
	Members(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public abstract void work();
}
