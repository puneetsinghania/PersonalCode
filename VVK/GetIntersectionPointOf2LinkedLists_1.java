package VVK;

public class GetIntersectionPointOf2LinkedLists_1 {
	
	public static void main(String[] args) {
	    // creating first linked list 
        Node68 head1 = new Node68(3); 
        head1.next = new Node68(6); 
        head1.next.next = new Node68(9); 
        head1.next.next.next = new Node68(15); 
        head1.next.next.next.next = new Node68(30); 
  
        // creating second linked list 
        Node68 head2 = new Node68(10); 
        head2.next = new Node68(15); 
        head2.next.next = new Node68(30); 
        
        Node68 ipoint=getIntersection(head1,head2);
        
        if(ipoint!=null)
        System.out.println(ipoint.data);
	}
	
	public static Node68 getIntersection(Node68 head1,Node68 head2)
	{
		int count1=getCount(head1);
		int count2=getCount(head2);
		Node68 isect;
		if(count1>count2)
		{
			int diff=count1-count2;
			
			 isect=findIntersect(diff,head1,head2);
		}
		else
		{
			int diff=count2-count1;
			
			 isect=findIntersect(diff,head2,head1);
		}
		
		return isect;
	}
	
	public static int getCount(Node68 head)
	{
		int count=0;
		Node68 cur=head;
		while(cur!=null)
		{
			count++;
			cur=cur.next;
		}
		return count;
	}
	public static Node68 findIntersect(int diff,Node68 head1,Node68 head2)
	{
		Node68 c1=head1;
		Node68 c2=head2;
		int count=0;
		if(diff>0)
		{
			while(count!=diff && c1!=null)
			{
				count++;
				c1=c1.next;
			}
		}
		
		while(c1!=null && c2!=null && c1.data!=c2.data)
		{
			c1=c1.next;
			c2=c2.next;
		}
		if(c1.data==c2.data)
			return c1;
		
		return null;
	}
	

}

class Node68
{
	int data;
	Node68 next;
	
	Node68(int data)
	{
		this.data=data;
		this.next=null;
	}
}
