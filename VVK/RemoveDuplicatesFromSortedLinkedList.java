package VVK;

public class RemoveDuplicatesFromSortedLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=7;
		int[] nodeData= {1,2,3,3,3,4,4};
		
		int i=0;
		Node12 temp=new Node12(nodeData[i]);
		temp.data=nodeData[i];
		temp.next=null;
		Node12 cur=temp;
		Node12 head=temp;
		Node12 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node12(nodeData[i]);
			temp.data=nodeData[i];
			temp.next=null;
			cur.next=temp;
			cur=cur.next;
		}
		
		System.out.println("======BEFORE=======");
		while(toPrint!=null)
		{
			System.out.print(toPrint.data +"->");
			toPrint=toPrint.next;
		}
		
		System.out.println();
		
		Node12 newHead=removeDuplicates(head);
		
		System.out.println("======AFTER=======");
		while(newHead!=null)
		{
			System.out.print(newHead.data +"->");
			newHead=newHead.next;
		}
		
	}
	
	//Important method here
	public static Node12 removeDuplicates(Node12 head)
	{
		Node12 cur=head;
		Node12 next=cur.next;
		
		while(cur!=null && next!=null)
		{
			if(cur.data!=next.data)
			{
				cur=cur.next;
				next=next.next;
			}
			else if(cur.data==next.data)
			{
				next=next.next;
				cur.next=next;
			}
			
		}
		return head;
		
	}
	
}



class Node12
{
	int data;
	Node12 next;
	public Node12(int data)
	{
		this.data=data;
		this.next=null;
	}
}
