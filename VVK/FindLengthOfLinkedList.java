package VVK;

public class FindLengthOfLinkedList {
	
	public static void main(String[] args) {
		int totalNodes=7;
	    int[] nodeDatas= {1,2,3,4,5,6,7};
		
		int i=0;
		Node56 temp=new Node56(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node56 cur=temp;
		Node56 head=temp;
		Node56 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node56(nodeDatas[i]);
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
		int length=length(head);        
		
		System.out.println(length);
		
	}
	
	//MOST IMPORTANT METHOD
	public static int length(Node56 head)
	{
		int count=0;
		Node56 cur=head;
		while(cur!=null)
		{
			count++;
			cur=cur.next;
		}
		return count;
	}
	
}



class Node56
{
	int data;
	Node56 next;
	
	public Node56(int data)
	{
		this.data=data;
		this.next=null;
	}
}
