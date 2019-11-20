package VVK;

public class ReverseALinkedList {
	
	public static void main(String[] args) {
		int totalNodes=7;
	    int[] nodeDatas= {1,2,3,4,5,6,7};
		
		int i=0;
		Node65 temp=new Node65(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node65 cur=temp;
		Node65 head=temp;
		Node65 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node65(nodeDatas[i]);
			temp.data=nodeDatas[i];
			temp.next=null;
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
		Node65 newhead=reverse(head);        
		
		Node65 toPrintNew=newhead;
		System.out.println("===========AFTER===========");
		while(toPrintNew!=null)
		{
			System.out.print(toPrintNew.data +"->");
			toPrintNew=toPrintNew.next;
		}
		
		
	}
	
	//MOST IMPORTANT METHOD
	public static Node65 reverse(Node65 head)
	{
		Node65 cur=head;
		Node65 prev=null;
		
		while(cur!=null)
		{
			Node65 next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		head=prev;
		
		return head;
	}
	
}



class Node65
{
	int data;
	Node65 next;
	
	public Node65(int data)
	{
		this.data=data;
		this.next=null;
	}
}
