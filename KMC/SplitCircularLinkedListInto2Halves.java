package KMC;

public class SplitCircularLinkedListInto2Halves {
	
	public static void main(String[] args) {
		int totalNodes=7;
		    int[] nodeDatas= {1,2,3,4,5,6,7};
			
		int i=0;
		Node77 temp=new Node77(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node77 cur=temp;
		Node77 head=temp;

		for(i=1;i<totalNodes;i++)
		{
			temp=new Node77(nodeDatas[i]);
			temp.data=nodeDatas[i];
			temp.next=null;
			cur.next=temp;
			cur=cur.next;
		}
		//to make LL circular
		cur.next=head;

		//MOST IMPORTANT METHOD CALL
		splitInto2Halves(head);

	}
	
	//MOST IMPORTANT METHOD
	public static void splitInto2Halves(Node77 head)
	{
		if(head==null)
			return;

		Node77 f=head;
		Node77 s=head;
		Node77 head2=null;

		while(f.next!=head && f.next.next!=head)
		{
			f=f.next.next;
			s=s.next;
		}

		if(f.next.next==head)
			f=f.next;

		Node77 head1=head;

		if(head.next!=head)
			head2=s.next;

		f.next=s.next;
		s.next=head;

		//to print and check 2 separate LLs which have been split just above
		System.out.println("1st LL:::::");
		printList(head1);

		System.out.println();

		System.out.println("2nd LL:::::");
		printList(head2);
		//
	}

	public static void printList(Node77 head)
	{
		if(head==null)
			return;

		Node77 temp= head;

		System.out.print(temp.data+"->");
		temp=temp.next;

		while(temp!=head)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	
}


class Node77
{
	int data;
	Node77 next;
	
	public Node77(int data)
	{
		this.data=data;
		this.next=null;
	}
}
