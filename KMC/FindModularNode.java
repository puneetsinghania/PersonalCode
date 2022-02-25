package KMC;

public class FindModularNode {
	
	public static void main(String[] args) {
		int totalNodes=7;
		    int[] nodeDatas= {1,2,3,4,5,6,7};
			
		int i=0;
		Node78 temp=new Node78(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node78 cur=temp;
		Node78 head=temp;
		Node78 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node78(nodeDatas[i]);
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
		Node78 modularNode = findModularNode(head,3);

		if(modularNode!=null)
			System.out.println(modularNode.data);
	}
	
	//MOST IMPORTANT METHOD
	public static Node78 findModularNode(Node78 head, int k)
	{
		if(head==null || k<=0)
			return null;

		Node78 modularNode=null;
		int n=1;

		for(Node78 cur=head; cur!=null; cur=cur.next)
		{
			if(n%k==0)
				modularNode=cur;

			n++;
		}
		return modularNode;
	}
	
}


class Node78
{
	int data;
	Node78 next;
	
	public Node78(int data)
	{
		this.data=data;
		this.next=null;
	}
}
