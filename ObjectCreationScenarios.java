
interface A
{
	public void a();
}

class AImpl implements A
{
    public void a()
 {
    System.out.println("Do something");
 }

}


class B
{
	 public void b()
	 {
		 System.out.println("B"); 
	 }
}
class C extends B
{
	
	 public void b()
	 {
		 System.out.println("C"); 
	 }
}

class D
{
	 public void d() throws Exception
	 {
		 System.out.println("D"); 
	 }
}
class E extends D
{
	@Override
	 public void d()
	 {
		 System.out.println("E"); 
	 }
}


public class ObjectCreationScenarios {

	public static void main(String[] args) {
		
		D d1=new D();
		try {
			d1.d();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		D d2=new E();
		try {
			d2.d();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		E d3=new E();
		try {
			d3.d();
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*A aa=new AImpl();
		aa.a();*/
		
		B b1=new B();
		b1.b();
		
		B b2=new C();
		b2.b();
		
		//Type mismatch: cannot convert from B to C
		/*C b3=new B();
		b3.b();*/
		
		/*Exception in thread "main" java.lang.ClassCastException: B cannot be cast to C
		at ObjectCreationScenarios.main(ObjectCreationScenarios.java:52)
		
		C b4=(C)new B();
		b4.b();*/
		
		C b5=new C();
		b5.b();
		
		
	}
}


