package VVK;

import java.util.HashMap;
import java.util.Map;

public class CloneALinkedListWithRandomPointer_2 {
	
	public static void main(String[] args) {
	    // creating first linked list 
	   Node71 head = new Node71(1);  
	   head.next = new Node71(2);  
	   head.next.next = new Node71(3);  
	   head.next.next.next = new Node71(4);  
	   head.next.next.next.next = new Node71(5);  
	  
	    // 1's random points to 3  
	    head.random =head.next.next;  
	  
	    // 2's random points to 1  
	   head.next.random = head;  
	  
	    // 3's and 4's random points to 5  
	   head.next.next.random =head.next.next.next.next;  
	   head.next.next.next.random =head.next.next.next.next;  
	  
	    // 5's random points to 2  
	   head.next.next.next.next.random =head.next;  
	  
	    System.out.println("Original list ::=======> ");  
	
	    Node71 toPrint=head;
	    while(toPrint!=null)
	    {
	    	System.out.print(toPrint.data+"->");
	    	System.out.print("========random=========");
	    	System.out.print(toPrint.random.data+"->");
	    	toPrint=toPrint.next;
	    }
	  
	    System.out.println();
	    
	    System.out.println("Cloned list ::=========> ");  
	    Node71 cloned_list = clone(head);  
	    
	    Node71 toPrintCloned=cloned_list;
	    while(toPrintCloned!=null)
	    {
	    	System.out.print(toPrintCloned.data+"->");
	    	System.out.print("=======random==========");
	    	System.out.print(toPrintCloned.random.data+"->");
	    	toPrintCloned=toPrintCloned.next;
	    }
	}
	
	public static Node71 clone(Node71 head)
	{
		Node71 origcur=head;
		Node71 clonecur=null;
		
		Map<Node71,Node71> map=new HashMap<>();
		
		while(origcur!=null)
		{
			clonecur=new Node71(origcur.data);
			map.put(origcur,clonecur);
			origcur=origcur.next;
		}
		
		origcur=head;
		
		while(origcur!=null)
		{
			clonecur=map.get(origcur);
			clonecur.next=map.get(origcur.next);
			clonecur.random=map.get(origcur.random);
			origcur=origcur.next;
		}
		
		return map.get(head);
	}

	

}

class Node71
{
	int data;
	Node71 next;
	Node71 random;
	
	Node71(int data)
	{
		this.data=data;
		this.next=null;
		this.random=null;
	}
}
