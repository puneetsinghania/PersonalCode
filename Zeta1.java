/*
public class Zeta1 {
	public NodeZ reArrange(NodeZ head,NodeZ mid)
	{
		NodeZ a1=mid.next;
		NodeZ cur=head;
		while(cur!=null && a1!=null)
		{
			NodeZ nexa1=a1.next;
			NodeZ nextcur=cur.next;
			cur.next=a1;
			a1.next=nextcur;
			cur=nextcur;
			a1=nexa1;
		}
		return head;
		
		//return head;
		
	}
	
	public NodeZ findMid(NodeZ head)
	{
		if(head==null)
			return null;
		
		NodeZ s=head;
		NodeZ f=head;
		while(s!=null && f!=null && f.next!=null)
		{
			f=f.next.next;
			s=s.next;
		}
		return s;
		//return ;
	}
	public NodeZ reverse(NodeZ head)
	{
		
		//return ;
	}
	public static void main(String[] args) {
		
		NodeZ head=new NodeZ(1);
	
		NodeZ mid=NodeZ findMid(head);
		Node head2=s.next;
		
		Node r=reArrange(NodeZ head,NodeZ s);
		
		
	}
}


class NodeZ
{
	public int val;
	public NodeZ next;
	NodeZ(int val)
	{
		this.val=val;
	}
	NodeZ()
	{
		this.val=0;
		this.next=null;
	}

}

*/