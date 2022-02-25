package KMC;

public class RotateListToRight_Clockwise_ByKPlaces {
	
	public static void main(String[] args) {
		int totalNodes=5;
		    int[] nodeDatas= {1,2,3,4,5};
			
		int i=0;
		Node83 temp=new Node83(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node83 cur=temp;
		Node83 head=temp;
		Node83 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node83(nodeDatas[i]);
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
		Node83 newhead = rotateClockwiseByK(head,2);

		Node83 toPrint2=newhead;

		System.out.println("===========AFTER==========");
		while(toPrint2!=null)
		{
			System.out.print(toPrint2.data +"->");
			toPrint2=toPrint2.next;
		}
	}
	
	//MOST IMPORTANT METHOD
	public static Node83 rotateClockwiseByK(Node83 head,int k)
	{
		if(head==null)
			return head;

		Node83 last=head;
		int len=1;

		while(last.next!=null)
		{
			last=last.next;
			len++;
		}

		if(k>len)
			k=k%len;

		//to convert this into anti-clockwise/left rotation by k --> which is quite easy to solve
		k=len-k;

		//means no rotation is needed, so return the head of the present list
		if(k==0 || k==len)
			return head;

		Node83 cur=head;
		int count=1;

		while(cur!=null && count<k)
		{
			cur=cur.next;
			count++;
		}

		if(cur==null)
			return head;

		Node83 kth=cur;
		last.next=head;
		head=kth.next;
		kth.next=null;

		return head;
	}

}


class Node83
{
	int data;
	Node83 next;
	
	public Node83(int data)
	{
		this.data=data;
		this.next=null;
	}
}
