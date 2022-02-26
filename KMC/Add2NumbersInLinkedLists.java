package KMC;

public class Add2NumbersInLinkedLists {
	
	public static void main(String[] args) {
		int totalNodes=3;
		    int[] nodeDatas= {3,5,5};
			
		int i=0;
		Node84 temp=new Node84(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.next=null;
		Node84 cur=temp;
		Node84 head=temp;
		Node84 toPrint=head;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node84(nodeDatas[i]);
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
		Node84 newhead = add2Numbers(head,head);

		Node84 toPrint2=newhead;

		System.out.println("===========AFTER==========");
		while(toPrint2!=null)
		{
			System.out.print(toPrint2.data +"->");
			toPrint2=toPrint2.next;
		}
	}
	
	//MOST IMPORTANT METHOD
	public static Node84 add2Numbers(Node84 l1, Node84 l2) {

		Node84 cur1=l1;
		Node84 cur2=l2;
		int len1=0;
		int len2=0;

		len1=findLength(cur1);
		len2=findLength(cur2);

		int diff=Math.abs(len1-len2);

		if(diff>0)
		{
			if(len2<len1)
			{
				l2=addDiffZerosToEnd(diff,l2);
			}
			else if(len1<len2)
			{
				l1=addDiffZerosToEnd(diff,l1);
			}
		}


		//add list1 and list2
		Node84 l3=null;
		Node84 newnode=null;
		Node84 cur3=null;

		int addValue=0;
		int dby10=0;
		int rem=0;
		int carry=0;

		cur1=l1;
		cur2=l2;

		while(cur1!=null && cur2!=null)
		{
			addValue=cur1.data+cur2.data;
			if(carry>0)
				addValue=addValue+carry;

			dby10=addValue/10;
			carry=dby10;
			rem=0;

			if(dby10>0)
			{
				rem=addValue%10;
				carry=dby10;
				newnode=new Node84(rem);
			}
			else{
				newnode=new Node84(addValue);
			}

			if(l3==null)
			{
				l3=newnode;
				cur3=newnode;
			}
			else
			{
				cur3.next=newnode;
				cur3=newnode;
			}

			cur1=cur1.next;
			cur2=cur2.next;

		}
		if(cur1==null && cur2==null && carry>0)
		{
			newnode=new Node84(carry);
			cur3.next=newnode;
			cur3=newnode;
		}

		return l3;
	}

	public static int findLength(Node84 cur)
	{
		int len=0;

		while(cur!=null)
		{
			cur=cur.next;
			len++;
		}

		return len;
	}

	public static Node84 addDiffZerosToEnd(int diff,Node84 l)
	{
		//add diff number of zeros to end of list
		int count=0;
		Node84 cur=l;

		while(cur.next!=null)
		{
			cur=cur.next;
		}

		while(count<diff)
		{
			Node84 newnode=new Node84(0);
			cur.next=newnode;
			cur=newnode;

			count++;
		}
		return l;
	}

}


class Node84
{
	int data;
	Node84 next;
	
	public Node84(int data)
	{
		this.data=data;
		this.next=null;
	}
}
