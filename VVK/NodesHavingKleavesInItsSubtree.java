package VVK;

import java.util.Stack;

public class NodesHavingKleavesInItsSubtree {
	
	static Stack<Node27> s1=new Stack<>();
	static Stack<Node27> s2=new Stack<>();
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node27 q;
		Node27 temp=new Node27(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node27 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node27(nodeDatas[i]);
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
		int count=countNodes(root,2);

		System.out.println(count);
		
	}
	
	public static int countNodes(Node27 root,int given)
	{
		if(root==null)
			return 0;
		
		if(root.left==null && root.right==null)
			return 1;
		
		int lc=countNodes(root.left,given);
		int rc=countNodes(root.right,given);
		int totc=lc+rc;
		
		if(totc==given)
			System.out.print(root.data+" ");
		
		return totc;
		
	}

}

class Node27
{
	int data;
	Node27 left;
	Node27 right;
	
	Node27(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
