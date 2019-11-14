package VVK;

import java.util.LinkedList;
import java.util.Queue;

public class BT_to_DLL_BFSbased {
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node17 q;
		Node17 temp=new Node17(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node17 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node17(nodeDatas[i]);
			temp.data=nodeDatas[i];
			temp.left=null;
			temp.right=null;
			
			q=root;
			
			while(true)
			{
				if(temp.data<q.data)
				{
					if(q.left==null)
					{
						q.left=temp;
						break;
					}
					else
					{
						q=q.left;
					}
				}
				else
				{
					if(q.right==null)
					{
						q.right=temp;
						break;
					}
					else
					{
						q=q.right;
					}
				}
					
			}
			
		}
		
		//important method here
		BT_to_DLL_convert_BFSbased(root);
		
		
		
	}
	
	public static void BT_to_DLL_convert_BFSbased(Node17 root)
	{
	
		Queue<Node17> q=new LinkedList<Node17>();
		Node17 prev=null,head=null;
		q.offer(root);
		while(!q.isEmpty())
		{
			Node17 temp=q.poll();
			Node17 cur=new Node17(temp.data);
			if(prev==null)
			{
				head=cur;
			}
			else
			{
				cur.left=prev;
				prev.right=cur;
			}
			prev=cur;
			
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
			
		}
		
		Node17 toPrint=head;
		while(toPrint!=null)
		{
			System.out.print(toPrint.data+"->");
			toPrint=toPrint.right;
		}
	
	}

}

class Node17
{
	int data;
	Node17 left;
	Node17 right;
	
	Node17(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
