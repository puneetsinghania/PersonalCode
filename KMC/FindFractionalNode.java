package KMC;

public class FindFractionalNode {
	
	public static void main(String[] args) {
		int totalNodes=7;
		    int[] nodeDatas= {1,2,3,4,5,6,7};
			
		int i=0;
		Node80 temp=new Node80(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node80 cur=temp;
		Node80 head=temp;
		Node80 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node80(nodeDatas[i]);
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
		Node80 fractionalNode = findFractionalNode(head,3);

		if(fractionalNode!=null)
			System.out.println(fractionalNode.data);
	}
	
	//MOST IMPORTANT METHOD
	public static Node80 findFractionalNode(Node80 head, int k)
	{
		if(head==null || k<=0)
			return null;

		Node80 fr=null;
		int n=0;		// -> 0 <- to facilitate ceiling value

		for(Node80 cur=head; cur!=null ; cur=cur.next)
		{
			if(n%k==0)
			{
				if(fr==null)
					fr=head;
				else
					fr=fr.next;
			}

			n++;
		}
		return fr;
	}
	
}


class Node80
{
	int data;
	Node80 next;
	
	public Node80(int data)
	{
		this.data=data;
		this.next=null;
	}
}
