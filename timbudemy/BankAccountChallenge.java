package timbudemy;

public class BankAccountChallenge {
	
	private int accountNo;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNo;
	
	public void setAccountNo(int ac)
	{
		this.accountNo=ac;
	}
	public int getAccountNo()
	{
		return this.accountNo;
	}
	
	public void setBalance(double bal)
	{
		this.balance=bal;
	}
	public double getBalance()
	{
		return this.balance;
	}

	public void setCustomerName(String name)
	{
		this.customerName=name;
	}
	public String getCustomerName()
	{
		return this.customerName;
	}
	
	public void setEmail(String eml)
	{
		this.email=eml;
	}
	public String getEmail()
	{
		return this.email;
	}
	
	public void setPhoneNo(int contactNo)
	{
		this.phoneNo=contactNo;
	}
	public int getPhoneNo()
	{
		return this.phoneNo;
	}
	
	public void deposit(double amount)
	{
		double curBal=getBalance();
		double newBal=curBal+amount;
		setBalance(newBal);
		
		System.out.println("Deposit success");
	}
	
	public void withdraw(double amount)
	{
		double curBal=getBalance();
		if(amount>curBal)
		{
			System.out.println("Insufficient funds");
		}
		else
		{
			double newBal=curBal-amount;
			setBalance(newBal);
			
			System.out.println("Withdrawal success");
		}
	}
}
