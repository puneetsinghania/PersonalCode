package KMC;

public class Merge2UnsortedLinkedLists_Iterative {
	
	public static void main(String[] args) {
		
		//LL1: 1->5->3
		Node128 head1 = new Node128(1); 
		head1.next = new Node128(5); 
		head1.next.next = new Node128(3); 
		
		//LL2: 0->4->2
		Node128 head2 = new Node128(0);
		head2.next = new Node128(4);
		head2.next.next = new Node128(2);

		Node128 mergedhead = mergeUnsortedLists(head1, head2);
		Node128 sortedHead = sortList(mergedhead);
		
		Node128 print=sortedHead;
		
		while(print!=null)
		{
			System.out.print(print.data+"->");
			print=print.next;
		}
	}

	public static Node128 sortList(Node128 head) {

		if(head==null || head.next==null)
			return head;

		Node128 f=head;
		Node128 s=head;
		Node128 prev=null;

		while(f!=null && f.next!=null)
		{
			prev=s;
			s=s.next;
			f=f.next.next;
		}

		prev.next=null;

		Node128 l1= sortList(head);
		Node128 l2= sortList(s);

		return mergeList(l1,l2);
	}

	public static Node128 mergeList(Node128 l1,Node128 l2) {

		Node128 newhead=null;
		Node128 s=null;

		if(l1==null)
			return l2;

		if(l2==null)
			return l1;

		if(l1.data<=l2.data)
		{
			s=l1;
			l1=s.next;
		}
		else
		{
			s=l2;
			l2=s.next;
		}

		newhead=s;

		while(l1!=null && l2!=null)
		{
			if(l2.data<=l1.data)
			{
				s.next=l2;
				s=l2;
				l2=s.next;
			}
			else if(l1.data<=l2.data)
			{
				s.next=l1;
				s=l1;
				l1=s.next;
			}
		}

		if(l2==null)
			s.next=l1;
		if(l1==null)
			s.next=l2;

		return newhead;
	}

	public static Node128 mergeUnsortedLists(Node128 head1,Node128 head2)
	{
		Node128 tail=head1;
		while(tail!=null)
		{
			if(tail.next==null && head2!=null)
			{
				tail.next=head2;
				break;
			}
			tail=tail.next;
		}
		return head1;
	}
	
}



class Node128
{
	int data;
	Node128 next;
	public Node128(int data)
	{
		this.data=data;
		this.next=null;
	}
}
