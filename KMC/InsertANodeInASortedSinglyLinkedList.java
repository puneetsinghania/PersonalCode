package KMC;

public class InsertANodeInASortedSinglyLinkedList {

	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;

		int i=1;
		Node74 temp=new Node74(nodeData);
		temp.data=nodeData;
		temp.next=null;
		Node74 cur=temp;
		Node74 head=temp;
		Node74 toPrint=head;

		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+3;
			temp=new Node74(nodeData);
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
		Node74 newHead=insertANodeInSortedWay(head,1);      //Case1: if toBeInserted is the 1st node
		newHead=insertANodeInSortedWay(newHead,50);          //Case2: if toBeInserted is the Last node
		newHead=insertANodeInSortedWay(newHead,3);          //Case3: if toBeInserted is the Middle node

		Node74 toPrintNew=newHead;
		System.out.println("===========AFTER==========");
		while(toPrintNew!=null)
		{
			System.out.print(toPrintNew.data +"->");
			toPrintNew=toPrintNew.next;
		}

	}

	//MOST IMPORTANT METHOD
	public static Node74 insertANodeInSortedWay(Node74 head, int given)
	{
		Node74 cur;
		Node74 newNode= new Node74(given);

		//Inserting at the 1st place
		if(head==null || newNode.data<=head.data)
		{
			newNode.next=head;
			head=newNode;
		}
		//Inserting at the middle or last place
		else
		{
			cur=head;
			while(cur.next!=null && cur.next.data < newNode.data)
			{
				cur=cur.next;
			}
			newNode.next=cur.next;
			cur.next=newNode;
		}

		return head;
	}

}



class Node74
{
	int data;
	Node74 next;

	public Node74(int data)
	{
		this.data=data;
		this.next=null;
	}
}
