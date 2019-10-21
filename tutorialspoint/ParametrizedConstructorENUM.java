package tutorialspoint;

enum Cars 
	{
	   lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
	   
	   private int price;
	   
	   Cars(int p) {
	      price = p;
	   }
	   
	   int getPrice() {
	      return price;
	   } 
	}

	public class ParametrizedConstructorENUM {
	   public static void main(String args[]){
	      System.out.println("All car prices:");
	      for (Cars c : Cars.values()) 
	    	  System.out.println(c + " costs " + c.getPrice() + " thousand dollars.");
	   }
	}