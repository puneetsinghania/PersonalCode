package VVK;

public class RotateALinkedListFromAGivenNode {
	
	public static void main(String[] args) {
		int totalNodes=8;
		  int[] nodeDatas= {1,2,3,4,5,6,7,8};
		
		int i=0;
		Node58 temp=new Node58(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node58 cur=temp;
		Node58 head=temp;
		Node58 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node58(nodeDatas[i]);
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
		Node58 newhead=rotateForGiven(head,5);        

		Node58 toPrintnew=newhead;
		System.out.println("===========AFTER==========");
		while(toPrintnew!=null)
		{
			System.out.print(toPrintnew.data +"->");
			toPrintnew=toPrintnew.next;
		}
	}
	
	//MOST IMPORTANT METHOD
	public static Node58 rotateForGiven(Node58 head, int given)
	{
		Node58 cur=head;
		while(cur!=null && cur.data!=given)
		{
			cur=cur.next;
		}
		Node58 newhead=cur.next;
		cur.next=null;
		Node58 cur2=newhead;
		while(cur2!=null && cur2.next!=null)
		{
			cur2=cur2.next;
		}
		cur2.next=head;
		
		return newhead;
	}
	
}



class Node58
{
	int data;
	Node58 next;
	
	public Node58(int data)
	{
		this.data=data;
		this.next=null;
	}
}
