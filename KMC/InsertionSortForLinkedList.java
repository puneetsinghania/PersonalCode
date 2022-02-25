package KMC;

public class InsertionSortForLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=7;
		    int[] nodeDatas= {3,2,4,1,5,7,6};
			
		int i=0;
		Node82 temp=new Node82(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node82 cur=temp;
		Node82 head=temp;
		Node82 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node82(nodeDatas[i]);
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
		Node82 newhead = insertionSort(head);

		Node82 toPrint2=newhead;

		System.out.println("===========AFTER==========");
		while(toPrint2!=null)
		{
			System.out.print(toPrint2.data +"->");
			toPrint2=toPrint2.next;
		}
	}
	
	//MOST IMPORTANT METHOD
	public static Node82 insertionSort(Node82 head)
	{
		Node82 cur=head;
		Node82 nextn=null;
		Node82 sorted=null;

		while(cur!=null)
		{
			nextn=cur.next;
			sorted=sortedInsert(cur,sorted);
			cur=nextn;
		}
		head=sorted;

		return head;
	}

	public static Node82 sortedInsert(Node82 newNode,Node82 sorted)
	{
		if(sorted==null || newNode.data<= sorted.data)
		{
			newNode.next=sorted;
			sorted=newNode;
		}
		else
		{
			Node82 cur=sorted;
			while(cur.next!=null && cur.next.data < newNode.data)
			{
				cur=cur.next;
			}
				newNode.next=cur.next;
				cur.next=newNode;

		}

		return sorted;
	}


}


class Node82
{
	int data;
	Node82 next;
	
	public Node82(int data)
	{
		this.data=data;
		this.next=null;
	}
}
