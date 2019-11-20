package VVK;

import java.util.Stack;

public class CheckIfSinglyLinkedListIsAPalindrome_1 {
	
	public static void main(String[] args) {
		int totalNodes=7;
		  int[] nodeDatas= {1,2,4,5,4,2,1};
		//int[] nodeDatas= {1,2,4,4,2,1};
		//int[] nodeDatas= {1,2,4,5,6,2,1};
		
		
		int i=0;
		Node54 temp=new Node54(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node54 cur=temp;
		Node54 head=temp;
		Node54 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node54(nodeDatas[i]);
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
	public static boolean isPalindrome(Node54 head)
	{
		Stack<Integer> s=new Stack<Integer>();
		Node54 cur=head;
		while(cur!=null)
		{
			s.push(cur.data);
			cur=cur.next;
		}
		cur=head;
		boolean flag=true;
		while(!s.isEmpty()) 
		{
			if(s.pop()==cur.data)
			{
				flag=true;
				cur=cur.next;
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



class Node54
{
	int data;
	Node54 next;
	
	public Node54(int data)
	{
		this.data=data;
		this.next=null;
	}
}
