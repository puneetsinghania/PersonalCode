package VVK;

import java.util.Stack;

public class LCAofBT {
	
	static Stack<Node28> s1=new Stack<>();
	static Stack<Node28> s2=new Stack<>();
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node28 q;
		Node28 temp=new Node28(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node28 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node28(nodeDatas[i]);
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
		Node28 lca=lca(root,root.left,root.right.right);
		
		System.out.println(lca.data);
	}
	
	public static Node28 lca(Node28 root,Node28 p,Node28 q)
	{
		if(root==null)
			return null;
		
		if(root==p||root==q)
			return root;
		
		Node28 left=lca(root.left,p,q);
		Node28 right=lca(root.right,p,q);
		
		if(left!=null && right!=null)
			return root;
		
		else
			return (left!=null?left:right);
		
	 }

}

class Node28
{
	int data;
	Node28 left;
	Node28 right;
	
	Node28(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
