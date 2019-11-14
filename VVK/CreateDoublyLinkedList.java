package VVK;

public class CreateDoublyLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;
		
		int i=1;
		Node3 temp=new Node3(nodeData);
		temp.data=nodeData;
		temp.next=null;
		temp.prev=null;
		Node3 cur=temp;
		Node3 head=temp;
		Node3 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node3(nodeData);
			temp.data=nodeData;
			temp.next=null;
			temp.prev=cur;
			cur.next=temp;
			cur=cur.next;
		}
		
		while(toPrint!=null)
		{
			System.out.print(toPrint.data +"->");
			toPrint=toPrint.next;
		}
		
	}
	
}



class Node3
{
	int data;
	Node3 next;
	Node3 prev;
	public Node3(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
