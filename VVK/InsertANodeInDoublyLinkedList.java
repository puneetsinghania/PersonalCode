package VVK;

public class InsertANodeInDoublyLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;
		
		int i=1;
		Node39 temp=new Node39(nodeData);
		temp.data=nodeData;
		temp.next=null;
		temp.prev=null;
		Node39 cur=temp;
		Node39 head=temp;
		Node39 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node39(nodeData);
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
		Node39 newHead=insertANode(head,1);  //Case1: if toBeInserted is the 1st node
		newHead=insertANode(newHead,7);      //Case2: if toBeInserted is the Last node
		newHead=insertANode(newHead,3);      //Case3: if toBeInserted is the Middle node
		
		Node39 toPrintNew=newHead;
		System.out.println("===========AFTER==========");
		while(toPrintNew!=null)
		{
			System.out.print(toPrintNew.data +"->");
			toPrintNew=toPrintNew.next;
		}
		
	}
	
	//MOST IMPORTANT METHOD
	public static Node39 insertANode(Node39 head, int given)
	{
		Node39 cur=head;
		//Case1: if toBeInserted is the 1st node
		if(given==head.data-1)
		{
			Node39 newNode=new Node39(given);
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		else
		{
		
			while(cur.next!=null)
				cur=cur.next;
		//Case2: if toBeInserted is the Last node
			if(cur.next==null && cur.data==given-1)
			{
			Node39 newNode=new Node39(given);
			cur.next=newNode;
			newNode.prev=cur;
			}
			else
			{
		//Case3: if toBeInserted is the Middle node	
				Node39 current=head;
				while(current.data!=given)
				{
					current=current.next;
				}
				
				if(current.data==given && current.next!=null && current.prev!=null) 
				{
					Node39 newNode=new Node39(given);
					Node39 nnext=current.next;
					current.next=newNode;
					newNode.prev=current;
					newNode.next=nnext;
					nnext.prev=newNode;
				}
			}
		}
		
	
		
	return head;	
	}
	
}



class Node39
{
	int data;
	Node39 next;
	Node39 prev;
	public Node39(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
