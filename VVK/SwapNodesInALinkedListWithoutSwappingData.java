package VVK;

public class SwapNodesInALinkedListWithoutSwappingData {
	
	public static void main(String[] args) {
		int totalNodes=6;
		int nodeData=2;
		
		int i=1;
		Node10 temp=new Node10(nodeData);
		temp.data=nodeData;
		temp.next=null;
		Node10 cur=temp;
		Node10 head=temp;
		Node10 toPrint=head;
		
		for(i=2;i<=totalNodes;i++)
		{
			nodeData=nodeData+1;
			temp=new Node10(nodeData);
			temp.data=nodeData;
			temp.next=null;
			cur.next=temp;
			cur=cur.next;
		}
		//To Swap nodes functionality: 1st: search those nodes to swap , 2nd: swap
		searchNodes(3,6,head);
		
	}
	
	//Important method here
	public static void searchNodes(int x,int y,Node10 head)
	{
		Node10 prev_x=null;
		Node10 cur=head;
		Node10 NodeX=null;
		Node10 NodeY=null;
		Node10 prev_y=null;
		
		while(cur!=null && cur.data!=x)
		{
			prev_x=cur;
			cur=cur.next;
		}
		if(cur!=null && cur.data==x)
		{
		NodeX=cur;	
		}
		
		cur=head;
		prev_y=null;
		while(cur!=null && cur.data!=y)
		{
			prev_y=cur;
			cur=cur.next;
		}
		if(cur!=null && cur.data==y)
		{
			NodeY=cur;
		}
		
		System.out.println("NodeX=>"+NodeX.data+ " ,NodeY=>"+NodeY.data+" ,prev_x=>"+prev_x.data+" ,prev_y=>"+prev_y.data);
		
		swapNodes(head,NodeX,NodeY,prev_x,prev_y);
		
	}
	
	
	public static void swapNodes(Node10 head,Node10 NodeX,Node10 NodeY,Node10 prevX,Node10 prevY)
	{
		
		Node10 temp=NodeY.next;
		NodeY.next=NodeX.next;
		NodeX.next=temp;
		
		if(prevX==null)
		{
			head=NodeY;
			prevY.next=NodeX;
		}
		else if(prevY==null)
		{
			head=NodeX;
			prevX.next=NodeY;
		}
		
		else if(prevX!=null && prevY!=null)
		{
			prevX.next=NodeY;
			prevY.next=NodeX;
		}
		
		
		//to dispay after swapping
		Node10 toPrint=head;
		System.out.println();
		
		while(toPrint!=null)
		{
			System.out.print(toPrint.data+" ");
			toPrint=toPrint.next;
		}
		
	}
	
	
}



class Node10
{
	int data;
	Node10 next;
	public Node10(int data)
	{
		this.data=data;
		this.next=null;
	}
}
