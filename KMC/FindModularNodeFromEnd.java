package KMC;

public class FindModularNodeFromEnd {
	
	public static void main(String[] args) {
		int totalNodes=19;
		    int[] nodeDatas= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
			
		int i=0;
		Node79 temp=new Node79(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node79 cur=temp;
		Node79 head=temp;
		Node79 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node79(nodeDatas[i]);
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
		Node79 modularNode = findModularNodeFromEnd(head,3);

		if(modularNode!=null)
			System.out.println(modularNode.data);
	}
	
	//MOST IMPORTANT METHOD
	public static Node79 findModularNodeFromEnd(Node79 head, int k)
	{
		Node79 cur=head;
		int count=1;
		Node79 start=head;

		while(cur!=null && count<k)
		{
			cur=cur.next;
			count++;
		}

		while(cur.next!=null)
		{
			cur=cur.next;
			start=start.next;
		}

		return start;
	}
	
}


class Node79
{
	int data;
	Node79 next;
	
	public Node79(int data)
	{
		this.data=data;
		this.next=null;
	}
}
