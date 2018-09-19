
public class RECURSION_SearchElementInArray {

	public static void main(String[] args) {
		int ar[]={25,46,29,78,32};
		
		int index=search(ar,0,78);
		if(index==-1)
			System.out.println("Not Present");
		else
			System.out.println("Present at index-->"+index);
	}
	static int search(int[] ar,int i,int element)
	{
		if(i>=ar.length||i<0)
			return -1;
		else
		{
			if(ar[i]==element)
				return i;
			else
				return search(ar,i+1,element);
		}	
	}
}
