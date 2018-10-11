package SOLID;

public class Student extends Members{

	Student(int id,String name)
	{
		super(id,name);
	}
	
	public void play()
	{
		System.out.println("Playing");
	}
	public void work()
	{
		play();
	}
}
