package KMC;

public class DisplayLinkedListFromEnd {
	
	public static void main(String[] args) {
		int totalNodes=7;
		    int[] nodeDatas= {1,2,3,4,5,6,7};
			
		int i=0;
		Node75 temp=new Node75(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node75 cur=temp;
		Node75 head=temp;
		Node75 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node75(nodeDatas[i]);
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
		displayFromEnd(head);

	}
	
	//MOST IMPORTANT METHOD
	public static void displayFromEnd(Node75 head)
	{
		if(head==null)
			return;

		displayFromEnd(head.next);

		System.out.print(head.data+"-->");
	}
	
}



class Node75
{
	int data;
	Node75 next;
	
	public Node75(int data)
	{
		this.data=data;
		this.next=null;
	}
}
