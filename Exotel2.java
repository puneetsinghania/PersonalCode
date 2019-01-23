
public class Exotel2 {

	public static void main(String[] args) {
		
		distance("Mercury","Earth");
	}
	
	public static void distance(String f1,String f2)
	{
	    String dis="MerVenEarMar";
	    int first=dis.indexOf(f1.substring(0,3))/3;
	    int second=dis.indexOf(f2.substring(0,3))/3;
	    int[] distances={100,200,300};
	    int sum=0;

	    while(second-->first)
	    {
	      sum=sum+distances[second];
	    }
	    System.out.print(sum);
	}
}
