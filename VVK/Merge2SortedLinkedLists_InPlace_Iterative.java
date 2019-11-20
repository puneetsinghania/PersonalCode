package VVK;

public class Merge2SortedLinkedLists_InPlace_Iterative {
	
	public static void main(String[] args) {
		
		//LL1: 1->3->5
		Node45 head1 = new Node45(1); 
		head1.next = new Node45(3); 
		head1.next.next = new Node45(5); 
		
		//LL2: 0->2->4
		Node45 head2 = new Node45(0);
		head2.next = new Node45(2);
		head2.next.next = new Node45(4);
		
		Node45 mergedhead = mergeLinkedLists(head1, head2); 
		
		Node45 print=mergedhead;
		
		while(print!=null)
		{
			System.out.print(print.data+"->");
			print=print.next;
		}
	}
	
	public static Node45 mergeLinkedLists(Node45 p,Node45 q)
	{
		if(p==null)
			return q;
		if(q==null)
			return p;
		
		Node45 sortL=null;
		if(p!=null && q!=null)
		{
			if(p.data<=q.data)
			{
				sortL=p;
				p=p.next;
			}
			else
			{
				sortL=q;
				q=q.next;
			}
				
		}
		Node45 newhead=sortL;
		
		while(p!=null && q!=null)
		{
			if(p.data<=q.data)
			{
				sortL.next=p;
				sortL=p;
				p=p.next;
			}
			else
			{
				sortL.next=q;
				sortL=q;
				q=q.next;
			}
		}
		if(p==null)
			sortL.next=q;
		if(q==null)
			sortL.next=p;
		
		return newhead;
	}
	
}



class Node45
{
	int data;
	Node45 next;
	public Node45(int data)
	{
		this.data=data;
		this.next=null;
	}
}
