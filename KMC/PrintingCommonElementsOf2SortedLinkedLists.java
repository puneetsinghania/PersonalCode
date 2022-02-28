package KMC;

public class PrintingCommonElementsOf2SortedLinkedLists {
	
	public static void main(String[] args) {
		int totalNodes=3;
		    int[] nodeDatas= {3,5,7};
			
		int i=0;
		Node87 temp=new Node87(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node87 cur=temp;
		Node87 head=temp;
		Node87 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node87(nodeDatas[i]);
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
		Node87 newhead = commonElements(head,head);

		Node87 toPrint2=newhead;

		System.out.println("===========AFTER==========");
		while(toPrint2!=null)
		{
			System.out.print(toPrint2.data +"->");
			toPrint2=toPrint2.next;
		}
	}
	
	//MOST IMPORTANT METHOD
	public static Node87 commonElements(Node87 head1, Node87 head2) {

		Node87 head3=null;
		Node87 cur1=head1;
		Node87 cur2=head2;
		Node87 cur3=null;
		Node87 newnode=null;

		while(cur1!=null && cur2!=null)
		{
			if(cur1.data==cur2.data)
			{
				newnode = new Node87(cur1.data);
				if(head3==null)
				{
					head3=newnode;
					cur3=head3;
				}
				else
				{
					cur3.next=newnode;
					cur3=newnode;
				}

				cur1=cur1.next;
				cur2=cur2.next;
			}
			else if(cur1.data<cur2.data)
			{
				cur1=cur1.next;
			}
			else if(cur1.data>cur2.data)
			{
				cur2=cur2.next;
			}
		}

		return head3;

	}


}


class Node87
{
	int data;
	Node87 next;
	
	public Node87(int data)
	{
		this.data=data;
		this.next=null;
	}
}
