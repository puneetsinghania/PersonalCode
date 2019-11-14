package VVK;

public class SearchAnElementInLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=5;
		int nodeData=2;
		
		int i=1;
		Node9 temp=new Node9(nodeData);
		temp.data=nodeData;
		temp.next=null;
		Node9 cur=temp;
		Node9 head=temp;
		Node9 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node9(nodeData);
			temp.data=nodeData;
			temp.next=null;
			cur.next=temp;
			cur=cur.next;
		}
		
		searchAnElement(head,5);
		
	}
	
	//Important method here
	public static void searchAnElement(Node9 head,int key)
	{
		
		Node9 cur=head;
		while(cur!=null && cur.data!=key)
		{
			cur=cur.next;
		}
		if(cur!=null && cur.data==key)
		{
			System.out.println("FOUND");
		}
		
	}
	
}



class Node9
{
	int data;
	Node9 next;
	public Node9(int data)
	{
		this.data=data;
		this.next=null;
	}
}
