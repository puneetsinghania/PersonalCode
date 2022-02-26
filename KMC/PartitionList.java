package KMC;

public class PartitionList {
	
	public static void main(String[] args) {
		int totalNodes=6;
		    int[] nodeDatas= {1,4,3,2,5,2};
			
		int i=0;
		Node85 temp=new Node85(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node85 cur=temp;
		Node85 head=temp;
		Node85 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node85(nodeDatas[i]);
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
		Node85 newhead = partitionList(head,3);

		Node85 toPrint2=newhead;

		System.out.println("===========AFTER==========");
		while(toPrint2!=null)
		{
			System.out.print(toPrint2.data +"->");
			toPrint2=toPrint2.next;
		}
	}
	
	//MOST IMPORTANT METHOD
	public static Node85 partitionList(Node85 head, int x) {

		if(head==null)
			return null;

		Node85 cur=head;
		Node85 head1=null;
		Node85 head2=null;
		Node85 cur1=null;
		Node85 cur2=null;
		Node85 newnode1=null;
		Node85 newnode2=null;

		while(cur!=null)
		{
			if(cur.data<x)
			{
				newnode1= new Node85(cur.data);
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
				newnode2= new Node85(cur.data);
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


class Node85
{
	int data;
	Node85 next;
	
	public Node85(int data)
	{
		this.data=data;
		this.next=null;
	}
}
