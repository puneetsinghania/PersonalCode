package VVK;

public class CloneALinkedListWithRandomPointer_1 {
	
	public static void main(String[] args) {
	    // creating first linked list 
	   Node70 head = new Node70(1);  
	   head.next = new Node70(2);  
	   head.next.next = new Node70(3);  
	   head.next.next.next = new Node70(4);  
	   head.next.next.next.next = new Node70(5);  
	  
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
	
	    Node70 toPrint=head;
	    while(toPrint!=null)
	    {
	    	System.out.print(toPrint.data+"->");
	    	System.out.print("========random=========");
	    	System.out.print(toPrint.random.data+"->");
	    	toPrint=toPrint.next;
	    }
	  
	    System.out.println();
	    
	    System.out.println("Cloned list ::=========> ");  
	    Node70 cloned_list = clone(head);  
	    
	    Node70 toPrintCloned=cloned_list;
	    while(toPrintCloned!=null)
	    {
	    	System.out.print(toPrintCloned.data+"->");
	    	System.out.print("=======random==========");
	    	System.out.print(toPrintCloned.random.data+"->");
	    	toPrintCloned=toPrintCloned.next;
	    }
	}
	
	public static Node70 clone(Node70 head)
	{
		Node70 cur=head;
		Node70 nextN=null;
		
		//Insert a node between each original node
		while(cur!=null)
		{
			nextN=cur.next;
			cur.next=new Node70(cur.data);
			cur.next.next=nextN;
			
			cur=nextN;
		}
		
		//to place random pointers on cloned list using original
		cur=head;
		nextN=head;
		
		while(cur!=null)
		{
			nextN=cur.next.next;
			cur.next.random=cur.random.next;
			
			cur=nextN;
			
		}
		
		//Separate original list and cloned list
		cur=head;
		nextN=head;
		Node70 clonehead=head.next;
		Node70 curclone=clonehead;
		
		while(curclone.next!=null && cur!=null && curclone!=null)
		{
			nextN=cur.next.next;
			cur.next=nextN;
			cur=nextN;
			
			curclone.next=curclone.next.next;
			curclone=curclone.next;
			
		}
		
		return clonehead;
		
	}

	

}

class Node70
{
	int data;
	Node70 next;
	Node70 random;
	
	Node70(int data)
	{
		this.data=data;
		this.next=null;
		this.random=null;
	}
}
