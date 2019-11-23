package VVK;

public class ReverseALinkedListInGroupsOfGivenSize_1 {
	
	public static void main(String[] args) {
	    // creating first linked list 
	   Node72 head = new Node72(1);  
	   head.next = new Node72(2);  
	   head.next.next = new Node72(3);  
	   head.next.next.next = new Node72(4);  
	   head.next.next.next.next = new Node72(5);  
	   head.next.next.next.next.next = new Node72(6);  
	   head.next.next.next.next.next.next = new Node72(7);  
	   head.next.next.next.next.next.next.next = new Node72(8);  
	   
	    System.out.println("===============BEFORE==============");  
	
	    Node72 toPrint=head;
	    while(toPrint!=null)
	    {
	    	System.out.print(toPrint.data+"->");
	    	toPrint=toPrint.next;
	    }
	  
	    System.out.println();
	    
	    System.out.println("===============AFTER==============");  
	    Node72 reversed = reverseInGroups(head,3);  
	    
	    Node72 toPrintnew=reversed;
	    while(toPrintnew!=null)
	    {
	    	System.out.print(toPrintnew.data+"->");
	    	toPrintnew=toPrintnew.next;
	    }
	}
	
	public static Node72 reverseInGroups(Node72 head, int size)
	{
		int count=0;
		Node72 cur=head;
		Node72 next=null;
		Node72 prev=null;
		
		while(cur!=null && count<size)
		{
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			count++;
		}
		if(next!=null)
		{
			head.next=reverseInGroups(next,size);
		}
		
		return prev;
	}

	

}

class Node72
{
	int data;
	Node72 next;
	
	Node72(int data)
	{
		this.data=data;
		this.next=null;
	}
}
