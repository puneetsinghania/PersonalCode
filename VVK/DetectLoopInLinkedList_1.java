package VVK;

import java.util.HashSet;
import java.util.Set;

public class DetectLoopInLinkedList_1 {
	
	static Node59 head;
	public static void main(String[] args) {

		DetectLoopInLinkedList_1 llist = new DetectLoopInLinkedList_1(); 
	      
	        llist.push(20); 
	        llist.push(4); 
	        llist.push(15); 
	        llist.push(10); 
	  
	        /*Create loop for testing */
	        llist.head.next.next.next.next = llist.head;
				
		//MOST IMPORTANT METHOD CALL
		Node59 loopPoint=detectLoop(head);        

		if(loopPoint!=null)
		System.out.println(loopPoint.data);
	}
	
	 public void push(int new_data) 
	    { 
	        /* 1 & 2: Allocate the Node & 
	                  Put in the data*/
	        Node59 new_node = new Node59(new_data); 
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head; 
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node; 
	    } 
	
	//MOST IMPORTANT METHOD
	public static Node59 detectLoop(Node59 head)
	{
		Set<Node59> set=new HashSet<>();
		Node59 cur=head;
		while(cur!=null)
		{
			if(set.contains(cur))
			{
				return cur;
			}
			else
			{
			set.add(cur);
			
			cur=cur.next;
			}
		}
		return null;
		
	}
	
	
}



class Node59
{
	int data;
	Node59 next;
	
	public Node59(int data)
	{
		this.data=data;
		this.next=null;
	}
}
