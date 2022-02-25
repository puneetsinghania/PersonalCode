package KMC;

public class ReorderList {
	
	public static void main(String[] args) {
		int totalNodes=7;
		    int[] nodeDatas= {1,2,3,4,5,6,7};
			
		int i=0;
		Node81 temp=new Node81(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node81 cur=temp;
		Node81 head=temp;
		Node81 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node81(nodeDatas[i]);
			temp.data=nodeDatas[i];
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
		Node81 newhead = reorder(head);

		Node81 toPrint2=newhead;

		System.out.println("===========AFTER==========");
		while(toPrint2!=null)
		{
			System.out.print(toPrint2.data +"->");
			toPrint2=toPrint2.next;
		}
	}
	
	//MOST IMPORTANT METHOD
	public static Node81 reorder(Node81 head)
	{
		Node81 f=head;
		Node81 s=head;
		Node81 prev=null;

		//split the linkedlist into 2 halves
		while(f!=null && f.next!=null)
		{
			prev=s;
			f=f.next.next;
			s=s.next;
		}

		Node81 head2=s;
		prev.next=null;

		//reverse the 2nd list
		Node81 cur2=head2;
		Node81 prev2=null;
		Node81 nextN=null;

		while(cur2!=null)
		{
			nextN=cur2.next;
			cur2.next=prev2;
			prev2=cur2;
			cur2=nextN;
		}

		head2=prev2;

		//append alternate nodes in the fashion List1Node->List2Node->List1Node->List2Node...
		Node81 cur1=head;
		cur2=head2;
		Node81 next1=cur1;
		Node81 next2=cur2;

		while(cur1!=null && cur2!=null)
		{
			next1=cur1.next;
			next2=cur2.next;

			cur1.next=cur2;
			if(next1!=null)
				cur2.next=next1;

			cur1=next1;
			cur2=next2;
		}
		return head;
	}

}


class Node81
{
	int data;
	Node81 next;
	
	public Node81(int data)
	{
		this.data=data;
		this.next=null;
	}
}
