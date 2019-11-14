package VVK;

import java.util.Stack;

public class ZigZagTraversalOfBT {
	
	static Stack<Node26> s1=new Stack<>();
	static Stack<Node26> s2=new Stack<>();
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node26 q;
		Node26 temp=new Node26(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node26 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node26(nodeDatas[i]);
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
		zigzagTraversal(root);
		
		
	}
	
	public static void zigzagTraversal(Node26 root)
	{
		s1.push(root);
		while(!s1.isEmpty()||!s2.isEmpty()) 
		{
			while(!s1.isEmpty()) 
			{
				Node26 temp=s1.pop();
				System.out.print(temp.data+" ");
				if(temp.left!=null)
					s2.push(temp.left);
				if(temp.right!=null)
					s2.push(temp.right);
			}
			while(!s2.isEmpty())
			{
				Node26 temp=s2.pop();
				System.out.print(temp.data+" ");
				if(temp.right!=null)
					s1.push(temp.right);
				if(temp.left!=null)
					s1.push(temp.left);
			}
		}
	}

}

class Node26
{
	int data;
	Node26 left;
	Node26 right;
	
	Node26(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
