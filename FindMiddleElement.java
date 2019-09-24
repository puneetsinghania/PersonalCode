
public class FindMiddleElement {

	public static void main(String[] args) {
		int a=2,b=5,c=7;
		int mid=middle(a,b,c);
		System.out.println(mid);
	}
	
	public static int middle(int a,int b,int c)
	{
		if((a<b && b<c) || (c<b && b<a))
				return b;
		
		else if((a<c && c<b) || (b<c && c<a))
			    return c;
		
		//else if((b<a && a<c) || (c<a && a<b))
		else
			return a;
			
	}
}
