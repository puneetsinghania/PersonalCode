package VVK;

public class CreateDoublyCircularLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;
		
		int i=1;
		Node4 temp=new Node4(nodeData);
		temp.data=nodeData;
		temp.next=null;
		temp.prev=null;
		Node4 cur=temp;
		Node4 head=temp;
		Node4 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node4(nodeData);
			temp.data=nodeData;
			temp.next=null;
			temp.prev=cur;
			cur.next=temp;
			cur=cur.next;
		}
		
		cur.next=head;
		head.prev=cur;
		
		System.out.println("cur.next=>"+cur.next.data);
		System.out.println("head.prev=>"+head.prev.data);
		/*while(toPrint!=null)
		{
			System.out.print(toPrint.data +"->");
			toPrint=toPrint.next;
		}*/
		
	}
	
}



class Node4
{
	int data;
	Node4 next;
	Node4 prev;
	public Node4(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
