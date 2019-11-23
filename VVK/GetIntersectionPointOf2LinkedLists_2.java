package VVK;

import java.util.HashSet;
import java.util.Set;

public class GetIntersectionPointOf2LinkedLists_2 {
	
	public static void main(String[] args) {
	    // creating first linked list 
        Node69 head1 = new Node69(3); 
        head1.next = new Node69(6); 
        head1.next.next = new Node69(9); 
        head1.next.next.next = new Node69(15); 
        head1.next.next.next.next = new Node69(30); 
  
        // creating second linked list 
        Node69 head2 = new Node69(10); 
        head2.next = new Node69(15); 
        head2.next.next = new Node69(30); 
        
        Node69 ipoint=getIntersection(head1,head2);
        
        if(ipoint!=null)
        System.out.println(ipoint.data);
	}
	
	public static Node69 getIntersection(Node69 head1,Node69 head2)
	{
		Node69 cur1=head1;
		Node69 cur2=head2;
		Set<Integer> set=new HashSet<>();
		
		while(cur1!=null)
		{
			set.add(cur1.data);
			cur1=cur1.next;
		}
		while(cur2!=null)
		{
			if(set.contains(cur2.data))
			{
				return cur2;
			}
			else
			{
				cur2=cur2.next;
			}
		}
		return null;
		
	}

	

}

class Node69
{
	int data;
	Node69 next;
	
	Node69(int data)
	{
		this.data=data;
		this.next=null;
	}
}
