package KMC;

public class CheckIfGivenLinkedListIsEvenOrOdd {
	
	public static void main(String[] args) {
		int totalNodes=7;
		    int[] nodeDatas= {1,2,3,4,5,6,7};
			
		int i=0;
		Node76 temp=new Node76(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node76 cur=temp;
		Node76 head=temp;
		Node76 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node76(nodeDatas[i]);
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
		boolean isEvenLength=checkEvenOrOddLength(head);
		if(isEvenLength)
			System.out.println("isEvenLength");
		else
			System.out.println("isOddLength");
	}
	
	//MOST IMPORTANT METHOD
	public static boolean checkEvenOrOddLength(Node76 head)
	{
		Node76 f=head;

		while(f!=null && f.next!=null)
		{
			f=f.next.next;
		}
		if(f==null)
			return true;
		else
			return false;
	}
	
}



class Node76
{
	int data;
	Node76 next;
	
	public Node76(int data)
	{
		this.data=data;
		this.next=null;
	}
}
