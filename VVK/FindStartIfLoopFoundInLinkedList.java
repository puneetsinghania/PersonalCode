package VVK;

public class FindStartIfLoopFoundInLinkedList {
	
	static Node62 head;
	public static void main(String[] args) {

		FindStartIfLoopFoundInLinkedList llist = new FindStartIfLoopFoundInLinkedList(); 
	      
	        llist.push(20); 
	        llist.push(4); 
	        llist.push(15); 
	        llist.push(10); 
	  
	        /*Create loop for testing */
	        llist.head.next.next.next.next = llist.head;
				
		//MOST IMPORTANT METHOD CALL
		Node62 loopPoint=detectLoop(head);        

		if(loopPoint!=null)
		{
		Node62 start=findStart(head,loopPoint);
		System.out.println(start.data);
		}
	}
	
	 public void push(int new_data) 
	    { 
	        /* 1 & 2: Allocate the Node & 
	                  Put in the data*/
	        Node62 new_node = new Node62(new_data); 
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head; 
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node; 
	    } 
	
	//MOST IMPORTANT METHOD
	public static Node62 detectLoop(Node62 head)
	{
		Node62 f=head;
		Node62 s=head;
		while(s!=null && f!=null && f.next!=null)
		{	
			f=f.next.next;
			s=s.next;
			
			if(f==s)
				return f;
			
		}
		return null;
		
	}
	
	public static Node62 findStart(Node62 head,Node62 loopPoint) 
	{
		Node62 start=head;
		while(start!=loopPoint)
		{
			start=start.next;
			loopPoint=loopPoint.next;
		}
			return start;
	}
	
	
}



class Node62
{
	int data;
	Node62 next;
	
	public Node62(int data)
	{
		this.data=data;
		this.next=null;
	}
}
