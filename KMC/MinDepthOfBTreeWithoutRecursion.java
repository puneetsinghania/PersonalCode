package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthOfBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node99 root = new Node99(2);
		root.left = new Node99(7);
		root.right = new Node99(5);
		root.left.right = new Node99(6);
		root.right.right = new Node99(9);
		root.right.right.left = new Node99(4);

		//important method here
		int minDepth = minDepth(root);

		System.out.println(minDepth);
	}

	public static int minDepth(Node99 root) {

		if(root==null)
			return 0;

		Queue<Node99> q= new LinkedList<>();
		q.offer(root);
		q.offer(null);

		int levels=0;

		while(!q.isEmpty())
		{
			Node99 temp= q.poll();

			if(temp!=null)
			{
				if(temp.left==null && temp.right==null)
					return levels+1;

				if(temp.left!=null)
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
			}
			else
			{
				levels++;
				q.offer(null);

				if(q.peek()==null)
					break;

			}
		}

		return levels;

	}
	
}

class Node99
{
	int data;
	Node99 left;
	Node99 right;
	
	Node99(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
