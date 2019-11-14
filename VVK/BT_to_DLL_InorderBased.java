package VVK;

import java.util.LinkedList;
import java.util.Queue;

public class BT_to_DLL_InorderBased {
	
	static Node18 prev=null;
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node18 q;
		Node18 temp=new Node18(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node18 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node18(nodeDatas[i]);
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
		BT_to_DLL_convert_Inorderbased(root,null);
		
		
		
	}
	
	public static void BT_to_DLL_convert_Inorderbased(Node18 p,Node18 head)
	{
		if(p==null) 
			return;
		//LEFT
		BT_to_DLL_convert_Inorderbased(p.left,head);
		
		//ROOT PROCESSING
		if(prev==null)
			head=p;
		else
		{
			p.left=prev;
			prev.right=p;
		}
		prev=p;
		
		//RIGHT
		BT_to_DLL_convert_Inorderbased(p.right,head);

	}

}

class Node18
{
	int data;
	Node18 left;
	Node18 right;
	
	Node18(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
