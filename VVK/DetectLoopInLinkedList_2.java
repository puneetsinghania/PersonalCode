package VVK;

public class DetectLoopInLinkedList_2 {
	
	static Node60 head;
	public static void main(String[] args) {

		DetectLoopInLinkedList_2 llist = new DetectLoopInLinkedList_2(); 
	      
	        llist.push(20); 
	        llist.push(4); 
	        llist.push(15); 
	        llist.push(10); 
	  
	        /*Create loop for testing */
	        llist.head.next.next.next.next = llist.head;
				
		//MOST IMPORTANT METHOD CALL
		Node60 loopPoint=detectLoop(head);        

		if(loopPoint!=null)
		System.out.println(loopPoint.data);
	}
	
	 public void push(int new_data) 
	    { 
	        /* 1 & 2: Allocate the Node & 
	                  Put in the data*/
	        Node60 new_node = new Node60(new_data); 
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head; 
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node; 
	    } 
	
	//MOST IMPORTANT METHOD
	public static Node60 detectLoop(Node60 head)
	{
		Node60 f=head;
		Node60 s=head;
		while(s!=null && f!=null && f.next!=null)
		{	
			f=f.next.next;
			s=s.next;
			
			if(f==s)
				return f;
			
		}
		return null;
		
	}
	
	
}



class Node60
{
	int data;
	Node60 next;
	
	public Node60(int data)
	{
		this.data=data;
		this.next=null;
	}
}
