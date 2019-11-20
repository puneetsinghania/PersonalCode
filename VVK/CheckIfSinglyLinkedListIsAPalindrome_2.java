package VVK;


public class CheckIfSinglyLinkedListIsAPalindrome_2 {
	
	public static void main(String[] args) {
		int totalNodes=7;
		  int[] nodeDatas= {1,2,4,5,4,2,1};
		//int[] nodeDatas= {1,2,4,4,2,1};
		//int[] nodeDatas= {1,2,4,5,6,2,1};
		
		
		int i=0;
		Node55 temp=new Node55(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node55 cur=temp;
		Node55 head=temp;
		Node55 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node55(nodeDatas[i]);
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
		boolean isPalin=isPalindrome(head);        
		
		System.out.println(isPalin);
		
	}
	
	//MOST IMPORTANT METHOD
	public static boolean isPalindrome(Node55 head)
	{
		Node55 f=head;
		Node55 s=head;
		Node55 secondhead=null;
		while(f!=null && f.next!=null)
		{
			f=f.next.next;
			if(f!=null && f.next==null)
			{
				secondhead=s.next.next;
				s.next=null;
				break;
			}
			else if(f==null)
			{
				secondhead=s.next;
				s.next=null;
				break;
			}
			s=s.next;
		}
		Node55 cur2=secondhead;
		Node55 prev2=null;
		while(cur2!=null)
		{
			Node55 next=cur2.next;
			cur2.next=prev2;
			prev2=cur2;
			cur2=next;
		}
		secondhead=prev2;
		
		Node55 p1=head;
		Node55 p2=secondhead;
		boolean flag=true;
		while(p1!=null && p2!=null)
		{
			if(p1.data==p2.data)
			{
				flag=true;
				p1=p1.next;
				p2=p2.next;
			}
			else
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
}



class Node55
{
	int data;
	Node55 next;
	
	public Node55(int data)
	{
		this.data=data;
		this.next=null;
	}
}
