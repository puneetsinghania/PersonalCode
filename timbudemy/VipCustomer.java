package timbudemy;

public class VipCustomer {
	
	private String name;
	private double creditLimit;
	private String email;
	
	public VipCustomer()
	{
		this("Puneet",1000,"ps@gmail.com");
	}
	
	public VipCustomer(String name,double creditLimit,String email)
	{
		this.name=name;
		this.creditLimit=creditLimit;
		this.email=email;
	}
	
	public VipCustomer(String name,double creditLimit)
	{
		this(name,creditLimit,"ram@gmail.com");
	}

	//getters
	public String getName() {
		return this.name;
	}

	public double getCreditLimit() {
		return this.creditLimit;
	}

	public String getEmail() {
		return this.email;
	}
	
}
