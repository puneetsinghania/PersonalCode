package tutorialspoint;


enum Car 
	{
	   lamborghini,tata,audi,fiat,honda
	}

public class enumWithSwitch {
	
	public static void main(String[] args) {
		
		Car c= Car.tata;
		
	      switch(c) {
	         case lamborghini:
	            System.out.println("You choose lamborghini!");
	            break;
	         case tata:
	            System.out.println("You choose tata!");
	            break;
	         case audi:
	            System.out.println("You choose audi!");
	            break;
	         case fiat:
	            System.out.println("You choose fiat!");
	            break;
	         case honda:
	            System.out.println("You choose honda!");
	            break;
	         default:
	            System.out.println("I don't know your car.");
	            break;
	      }
	}

}
