package VVK;

public class Merge2SortedLinkedLists_InPlace_Recursive {
	
	public static void main(String[] args) {
		
		//LL1: 1->3->5
		Node46 head1 = new Node46(1); 
		head1.next = new Node46(3); 
		head1.next.next = new Node46(5); 
		
		//LL2: 0->2->4
		Node46 head2 = new Node46(0);
		head2.next = new Node46(2);
		head2.next.next = new Node46(4);
		
		Node46 mergedhead = mergeLinkedLists(head1, head2); 
		
		Node46 print=mergedhead;
		
		while(print!=null)
		{
			System.out.print(print.data+"->");
			print=print.next;
		}
	}
	
	public static Node46 mergeLinkedLists(Node46 p,Node46 q)
	{
		if(p==null)
			return q;
		if(q==null)
			return p;
		
		if(p.data < q.data)
		{
			p.next=mergeLinkedLists(p.next,q);
			return p;
		}
		else
		{
			q.next=mergeLinkedLists(p,q.next);
			return q;
		}
	}
	
}



class Node46
{
	int data;
	Node46 next;
	public Node46(int data)
	{
		this.data=data;
		this.next=null;
	}
}
