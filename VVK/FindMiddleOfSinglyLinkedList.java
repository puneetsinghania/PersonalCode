package VVK;

import java.util.Stack;

public class FindMiddleOfSinglyLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=7;
		    int[] nodeDatas= {1,2,3,4,5,6,7};
		 // int[] nodeDatas= {1,2,3,4,5,6};
		
		
		int i=0;
		Node63 temp=new Node63(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node63 cur=temp;
		Node63 head=temp;
		Node63 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node63(nodeDatas[i]);
			temp.data=nodeDatas[i];
			temp.next=null;
			cur.next=temp;
			cur=cur.next;
		}
		
		System.out.println("===========LINKED LIST==========");
		while(toPrint!=null)
		{
			System.out.print(toPrint.data +"->");
			toPrint=toPrint.next;
		}
		
		System.out.println();
		
		//MOST IMPORTANT METHOD CALL
		Node63 middle=middle(head);        
		
		System.out.println(middle.data);
		
	}
	
	//MOST IMPORTANT METHOD
	public static Node63 middle(Node63 head)
	{
		Node63 f=head;
		Node63 s=head;
		while(f!=null && s!=null && f.next!=null)
		{
			f=f.next.next;
			s=s.next;
		}
		return s;
	}
	
}



class Node63
{
	int data;
	Node63 next;
	
	public Node63(int data)
	{
		this.data=data;
		this.next=null;
	}
}
