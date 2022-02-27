package KMC;

public class PartitionListForEvenAndOdd {
	
	public static void main(String[] args) {
		int totalNodes=6;
		    int[] nodeDatas= {1,4,3,2,5,2};
			
		int i=0;
		Node86 temp=new Node86(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node86 cur=temp;
		Node86 head=temp;
		Node86 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node86(nodeDatas[i]);
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
		Node86 newhead = partitionListForEvenAndOdd(head);

		Node86 toPrint2=newhead;

		System.out.println("===========AFTER==========");
		while(toPrint2!=null)
		{
			System.out.print(toPrint2.data +"->");
			toPrint2=toPrint2.next;
		}
	}
	
	//MOST IMPORTANT METHOD
	public static Node86 partitionListForEvenAndOdd(Node86 head) {

		if(head==null)
			return null;

		Node86 cur=head;
		Node86 head1=null;
		Node86 head2=null;
		Node86 cur1=null;
		Node86 cur2=null;
		Node86 newnode1=null;
		Node86 newnode2=null;

		while(cur!=null)
		{
			if(cur.data%2==0)
			{
				newnode1= new Node86(cur.data);
				if(head1==null)
				{
					head1=newnode1;
					cur1=head1;
				}
				else
				{
					cur1.next=newnode1;
					cur1=newnode1;
				}

			}
			else
			{
				newnode2= new Node86(cur.data);
				if(head2==null)
				{
					head2=newnode2;
					cur2=head2;
				}
				else
				{
					cur2.next=newnode2;
					cur2=newnode2;
				}
			}

			cur=cur.next;
		}

		if(cur1!=null)
			cur1.next=head2;


		if(head1==null && head2!=null)
			return head2;
		else
			return head1;

	}

}


class Node86
{
	int data;
	Node86 next;
	
	public Node86(int data)
	{
		this.data=data;
		this.next=null;
	}
}
