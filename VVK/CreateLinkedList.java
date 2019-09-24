package VVK;

public class CreateLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;
		
		int i=1;
		Node temp=new Node(nodeData);
		temp.data=nodeData;
		temp.next=null;
		Node cur=temp;
		Node head=temp;
		Node toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node(nodeData);
			temp.data=nodeData;
			temp.next=null;
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



class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
