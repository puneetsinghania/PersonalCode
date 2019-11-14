package VVK;

public class DeleteLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;
		
		int i=1;
		Node8 temp=new Node8(nodeData);
		temp.data=nodeData;
		temp.next=null;
		Node8 cur=temp;
		Node8 head=temp;
		Node8 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node8(nodeData);
			temp.data=nodeData;
			temp.next=null;
			cur.next=temp;
			cur=cur.next;
		}
		
		/*while(toPrint!=null)
		{
			System.out.print(toPrint.data +"->");
			toPrint=toPrint.next;
		}
		*/
		
		deleteCompleteLinkedList(head);
		
	}
	
	//Important method here
	public static void deleteCompleteLinkedList(Node8 head)
	{
		
		Node8 cur=head;
		Node8 next;
		
		while(cur!=null)
		{
			next=cur.next;
			cur.next=null;
			cur=next;
		}
		
	}
	
}



class Node8
{
	int data;
	Node8 next;
	public Node8(int data)
	{
		this.data=data;
		this.next=null;
	}
}
