package VVK;

public class nth_Node_FromTheENDofALinkedList {
	
	public static void main(String[] args) {
		int totalNodes=6;
		int[] nodeData= {1,3,5,7,9,11};
		
		int i=0;
		Node23 temp=new Node23(nodeData[i]);
		temp.data=nodeData[i];
		temp.next=null;
		Node23 cur=temp;
		Node23 head=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node23(nodeData[i]);
			temp.data=nodeData[i];
			temp.next=null;
			cur.next=temp;
			cur=cur.next;
		}
		
		
		nthNodeFromEnd(head,4);
		
		
	}
	
	//Important method here
	public static void nthNodeFromEnd(Node23 head,int n)
	{
		int count=1;
		Node23 cur=head;
		Node23 start=head;
		while(count<n)
		{
			cur=cur.next;
			count++;
		}
		
		while(cur.next!=null)
		{
			cur=cur.next;
			start=start.next;
		}
		System.out.println(start.data);
		
	}
	
}



class Node23
{
	int data;
	Node23 next;
	public Node23(int data)
	{
		this.data=data;
		this.next=null;
	}
}
