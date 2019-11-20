package VVK;

import java.util.HashSet;
import java.util.Set;

public class RemoveIfLoopFoundInLinkedList {
	
	static Node61 head;
	public static void main(String[] args) {

		RemoveIfLoopFoundInLinkedList llist = new RemoveIfLoopFoundInLinkedList(); 
	      
	        llist.push(20); 
	        llist.push(4); 
	        llist.push(15); 
	        llist.push(10); 
	  
	        /*Create loop for testing */
	        llist.head.next.next.next.next = llist.head;
				
		//MOST IMPORTANT METHOD CALL
	    Node61 loopRemovedList=removeLoop(head);        

	    if(loopRemovedList!=null)
	    {
	    	Node61 toPrint=loopRemovedList;
	    	while(toPrint!=null)
	    	{
	    		System.out.print(toPrint.data+" ");
	    		toPrint=toPrint.next;
	    	}
	    }
	}
	
	 public void push(int new_data) 
	    { 
	        /* 1 & 2: Allocate the Node & 
	                  Put in the data*/
	        Node61 new_node = new Node61(new_data); 
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head; 
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node; 
	    } 
	
	//MOST IMPORTANT METHOD
	public static Node61 removeLoop(Node61 head)
	{
		Node61 cur=head;
		Node61 prev=null;
		Set<Node61> set=new HashSet<>();
		while(cur!=null)
		{
			if(set.contains(cur))
			{
				prev.next=null;
				return head;
			}
			else
			{
				set.add(cur);
				prev=cur;
				cur=cur.next;
			}
		}
		return null;
		
	}
	
	
}



class Node61
{
	int data;
	Node61 next;
	
	public Node61(int data)
	{
		this.data=data;
		this.next=null;
	}
}
