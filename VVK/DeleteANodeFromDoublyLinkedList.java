package VVK;

public class DeleteANodeFromDoublyLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=1;
		
		int i=1;
		Node38 temp=new Node38(nodeData);
		temp.data=nodeData;
		temp.next=null;
		temp.prev=null;
		Node38 cur=temp;
		Node38 head=temp;
		Node38 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node38(nodeData);
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
		Node38 newHead=deleteANode(head,1);//Case1: if toBeDeleted is the 1st node
		newHead=deleteANode(newHead,5);    //Case2: if toBeDeleted is the Last node
		newHead=deleteANode(newHead,3);    //Case3: if toBeDeleted is the Middle node
		
		Node38 toPrintNew=newHead;
		System.out.println("===========AFTER==========");
		while(toPrintNew!=null)
		{
			System.out.print(toPrintNew.data +"->");
			toPrintNew=toPrintNew.next;
		}
		
	}
	
	//MOST IMPORTANT METHOD
	public static Node38 deleteANode(Node38 head, int given)
	{
		Node38 cur=head;
		//Case1: if toBeDeleted is the 1st node
		if(given==head.data)
		{
			head=head.next;
			head.prev=null;
		}
		
		//Case2: if toBeDeleted is the Last node
		else
		{
			while(cur!=null && cur.data!=given)
			{
				cur=cur.next;
			}
			if(cur!=null && cur.data==given && cur.next==null)
			{
				cur.prev.next=null;
			}
		//Case3: if toBeDeleted is the Middle node
			else if(cur!=null && cur.data==given && cur.next!=null && cur.prev!=null)
			{
				cur.prev.next=cur.next;
				cur.next.prev=cur.prev;
			}
		}
		
	
		
		return head;
	}
	
}



class Node38
{
	int data;
	Node38 next;
	Node38 prev;
	public Node38(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
