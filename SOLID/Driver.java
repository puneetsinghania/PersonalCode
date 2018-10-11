package SOLID;

public class Driver {

	public static void main(String[] args) {
		
		Mgmt m=new Mgmt();
		
		Student s=new Student(1,"Puneet");
		Teacher t=new Teacher(1,"Pratima");
		
		m.work(s);
		m.work(t);
		
	}
}
