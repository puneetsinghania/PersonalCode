package VVK;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnsortedLinkedList_A {
	
	public static void main(String[] args) {
		int totalNodes=7;
		int[] nodeData= {1,3,2,3,5,4,5};
		
		int i=0;
		Node22 temp=new Node22(nodeData[i]);
		temp.data=nodeData[i];
		temp.next=null;
		Node22 cur=temp;
		Node22 head=temp;
		Node22 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node22(nodeData[i]);
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
		
		Node22 newHead=removeDuplicatesFromUnsorted(head);
		
		System.out.println("======AFTER=======");
		while(newHead!=null)
		{
			System.out.print(newHead.data +"->");
			newHead=newHead.next;
		}
		
	}
	
	//Important method here
	public static Node22 removeDuplicatesFromUnsorted(Node22 head)
	{
		Set<Integer> set=new HashSet<>();
		
		Node22 cur=head;
		Node22 prev=null;
		Node22 next=null;
		
		while(cur!=null)
		{
			next=cur.next;
			if(!set.contains(cur.data))
			{
				set.add(cur.data);
				prev=cur;
				cur=next;
			}
			else
			{
				prev.next=next;
				cur=next;
			}
		}
		return head;
		
		
	}
	
}



class Node22
{
	int data;
	Node22 next;
	public Node22(int data)
	{
		this.data=data;
		this.next=null;
	}
}
