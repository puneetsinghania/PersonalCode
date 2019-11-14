package VVK;

public class ReverseDoublyLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=1;
		
		int i=1;
		Node11 temp=new Node11(nodeData);
		temp.data=nodeData;
		temp.next=null;
		temp.prev=null;
		Node11 cur=temp;
		Node11 head=temp;
		Node11 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node11(nodeData);
			temp.data=nodeData;
			temp.next=null;
			temp.prev=cur;
			cur.next=temp;
			cur=cur.next;
		}
		
		System.out.println("===========BEFORE==========");
		while(toPrint!=null)
		{
			System.out.print(toPrint.data +"->");
			toPrint=toPrint.next;
		}
		
		System.out.println();
		
		//MOST IMPORTANT METHOD CALL
		Node11 newHead=reverseDoubly(head);
		
		Node11 toPrintNew=newHead;
		System.out.println("===========AFTER==========");
		while(toPrintNew!=null)
		{
			System.out.print(toPrintNew.data +"->");
			toPrintNew=toPrintNew.next;
		}
		
	}
	
	//MOST IMPORTANT METHOD
	public static Node11 reverseDoubly(Node11 head)
	{
		Node11 cur=head;
		Node11 previous=cur.prev; //null
		Node11 next=null;
		
		while(cur!=null)
		{
			next=cur.next;
			cur.next=previous;
			cur.prev=next;
			previous=cur;
			cur=next;
		}
		head=previous;	
		
		return head;
	}
	
}



class Node11
{
	int data;
	Node11 next;
	Node11 prev;
	public Node11(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
