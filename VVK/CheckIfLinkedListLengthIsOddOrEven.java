package VVK;

import java.util.Stack;

public class CheckIfLinkedListLengthIsOddOrEven {
	
	public static void main(String[] args) {
		int totalNodes=8;
		  int[] nodeDatas= {1,2,3,4,5,6,7,8};
		
		int i=0;
		Node57 temp=new Node57(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node57 cur=temp;
		Node57 head=temp;
		Node57 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node57(nodeDatas[i]);
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
		int val=oddOrEven(head);        
		
		if(val==1)
		System.out.println("ODD LENGTH");
		else
		System.out.println("EVEN LENGTH");	
		
	}
	
	//MOST IMPORTANT METHOD
	public static int oddOrEven(Node57 head)
	{
		Node57 cur=head;
		while(cur!=null && cur.next!=null)
		{
			cur=cur.next.next;
		}
		if(cur==null)
			return 0;
		else
			return 1;
	}
	
}



class Node57
{
	int data;
	Node57 next;
	
	public Node57(int data)
	{
		this.data=data;
		this.next=null;
	}
}
