
public class ExotelOp {

	public static void main(String[] args) {
		
		distance("Mercury","Mars");
	}
	
	public static void distance(String p,String l)
	{
	    String dis="MerVenEarMar";
	    int first=dis.indexOf(p.substring(0,3))/3;
	    int second=dis.indexOf(l.substring(0,3))/3;
	    int  m=1;
	    int  t=second;
	    int distances[]={100,200,300};
	    int sum=0;
	    if(first>second){
	        second=first;
	        first=t;
	        m=-1;
	    }
	    for(;second-->first;)
	        sum+=distances[second];
	    System.out.print(sum*m);
	}
}
