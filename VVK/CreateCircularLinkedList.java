package VVK;

public class CreateCircularLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;
		
		int i=1;
		Node1 temp=new Node1(nodeData);
		temp.data=nodeData;
		temp.next=null;
		Node1 cur=temp;
		Node1 head=temp;
		Node1 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node1(nodeData);
			temp.data=nodeData;
			temp.next=null;
			cur.next=temp;
			cur=cur.next;
		}
		
		cur.next=head; //most important line -the only different line from normal linked list
		
		System.out.println("Head==>"+head.data);
		System.out.println("cur.next==>"+cur.next.data);
		
		/*while(toPrint!=null)
		{
			System.out.print(toPrint.data +"->");
			toPrint=toPrint.next;
		}*/
		
	}
	
}



class Node1
{
	int data;
	Node1 next;
	public Node1(int data)
	{
		this.data=data;
		this.next=null;
	}
}
