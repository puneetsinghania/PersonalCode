package VVK;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNoOfLeavesInBT_Iterative {
		
	public static void main(String[] args) {
		
		Node43 root=new Node43(10);
        root.left = new Node43(8); 
        root.right = new Node43(2); 
        root.left.left = new Node43(3); 
        root.left.right = new Node43(5); 
        root.right.left = new Node43(2); 
		
		//important method here
		int leaves=printNumberOfLeaves(root);
		
		System.out.println(leaves);
		
	}
	
	public static int printNumberOfLeaves(Node43 root)
	{
		int count=0;
		Queue<Node43> q=new LinkedList<Node43>();
		q.offer(root);
		while(!q.isEmpty())
		{
			Node43 temp=q.poll();
			if(temp.left==null && temp.right==null)
				count++;
			
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
		return count;
		
	}

}

class Node43
{
	int data;
	Node43 left;
	Node43 right;
	
	Node43(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
