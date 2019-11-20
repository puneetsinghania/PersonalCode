package VVK;

public class DeleteANodeInASinglyLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=1;
		
		int i=1;
		Node41 temp=new Node41(nodeData);
		temp.data=nodeData;
		temp.next=null;
		Node41 cur=temp;
		Node41 head=temp;
		Node41 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node41(nodeData);
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
		Node41 newHead=deleteANode(head,1);        //Case1: if toBeDeleted is the 1st node
		newHead=deleteANode(newHead,5);            //Case2: if toBeDeleted is the Last node
		newHead=deleteANode(newHead,3);            //Case3: if toBeDeleted is the Middle node
		
		Node41 toPrintNew=newHead;
		System.out.println("===========AFTER==========");
		while(toPrintNew!=null)
		{
			System.out.print(toPrintNew.data +"->");
			toPrintNew=toPrintNew.next;
		}
		
	}
	
	//MOST IMPORTANT METHOD
	public static Node41 deleteANode(Node41 head, int given)
	{
		//Case1: if toBeDeleted is the 1st node
		if(head.data==given)
		{
			Node41 cur=head;
			head=head.next;
			cur.next=null;
		}
		//Case2: if toBeDeleted is the Last node
		else
		{
			Node41 cur=head;
			Node41 prev=null;
			while(cur.next!=null)
			{
				prev=cur;
				cur=cur.next;
			}
			if(cur.next==null && cur.data==given)
			{
				prev.next=null;
			}
			else
			{
		 //Case3: if toBeDeleted is the Middle node		
				Node41 current=head;
				Node41 previous=null;
				while(current.data!=given)
				{
					previous=current;
					current=current.next;
				}
				if(current.data==given && current.next!=null && previous!=null) 
				{
					previous.next=current.next;
					current.next=null;
				}
			}
		}
		
		return head;
	}
	
}



class Node41
{
	int data;
	Node41 next;
	
	public Node41(int data)
	{
		this.data=data;
		this.next=null;
	}
}
