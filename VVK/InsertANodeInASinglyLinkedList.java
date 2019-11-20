package VVK;

public class InsertANodeInASinglyLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;
		
		int i=1;
		Node40 temp=new Node40(nodeData);
		temp.data=nodeData;
		temp.next=null;
		Node40 cur=temp;
		Node40 head=temp;
		Node40 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node40(nodeData);
			temp.data=nodeData;
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
		Node40 newHead=insertANode(head,1);      //Case1: if toBeInserted is the 1st node
		newHead=insertANode(newHead,7);          //Case2: if toBeInserted is the Last node
		newHead=insertANode(newHead,3);          //Case3: if toBeInserted is the Middle node
		
		Node40 toPrintNew=newHead;
		System.out.println("===========AFTER==========");
		while(toPrintNew!=null)
		{
			System.out.print(toPrintNew.data +"->");
			toPrintNew=toPrintNew.next;
		}
		
	}
	
	//MOST IMPORTANT METHOD
	public static Node40 insertANode(Node40 head, int given)
	{
		Node40 cur=head;
		//Case1: if toBeInserted is the 1st node
		if(given==head.data-1)
		{
			Node40 newNode=new Node40(given);
			newNode.next=head;
			head=newNode;
		}
		//Case2: if toBeInserted is the Last node
		else
		{
			while(cur.next!=null)
				cur=cur.next;
			
			if(cur.next==null && cur.data==given-1)
			{
				Node40 newNode=new Node40(given);
				cur.next=newNode;
			}
		//Case3: if toBeInserted is the Middle node
			else
			{
				Node40 current=head;
				while(current.data!=given)
					current=current.next;
				
				if(current.data==given && current.next!=null)
				{
					Node40 newNode=new Node40(given);
					Node40 nnext=current.next;
					current.next=newNode;
					newNode.next=nnext;
				}
			}
			
		}
		
		
		
		return head;
	}
	
}



class Node40
{
	int data;
	Node40 next;
	
	public Node40(int data)
	{
		this.data=data;
		this.next=null;
	}
}
