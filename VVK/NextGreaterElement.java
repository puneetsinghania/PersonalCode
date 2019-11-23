package VVK;

import java.util.Stack;

//confusing..check alternate solution
public class NextGreaterElement {
	
	public static void main(String[] args) {
		
		int[] ar= {4,5,2,25};
		
		Stack<Integer> s=new Stack<>();
		int j=0;
		
		for(int i=0;i<ar.length;i++) 
		{
		
			if(s.isEmpty())
			s.push(ar[i]);
			else
			{
				if(ar[i]<s.peek())
				{
					s.push(ar[i]);
				}
				else
				{
					ar[j]=ar[i];
					j++;
					while(!s.isEmpty() && ar[i]>=s.peek())
					{
						s.pop();
						if(j<i) {
						ar[j]=ar[i];
						j++;}
					}
					s.push(ar[i]);
					
				}
			}
			
			
		}
	}

}
