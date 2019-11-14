package VVK;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_BinaryTree {
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node16 q;
		Node16 temp=new Node16(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node16 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node16(nodeDatas[i]);
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
		BFS(root);
		
		
		
	}
	
	public static void BFS(Node16 root)
	{
	
		Queue<Node16> q=new LinkedList<Node16>();
		q.offer(root);
		while(!q.isEmpty())
		{
			Node16 temp=q.poll();
			if(temp!=null)
				System.out.println(temp.data+" ");
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
	
	}

}

class Node16
{
	int data;
	Node16 left;
	Node16 right;
	
	Node16(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
