package VVK;

public class TraverseLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;
		
		int i=1;
		Node6 temp=new Node6(nodeData);
		temp.data=nodeData;
		temp.next=null;
		Node6 cur=temp;
		Node6 head=temp;
		Node6 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node6(nodeData);
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
		
		traverse(head);
		
	}
	
	//Important method here
	public static void traverse(Node6 head)
	{
		Node6 p=head;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
	
}



class Node6
{
	int data;
	Node6 next;
	public Node6(int data)
	{
		this.data=data;
		this.next=null;
	}
}
