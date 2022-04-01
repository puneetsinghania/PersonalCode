package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node97 root = new Node97(2);
		root.left = new Node97(7);
		root.right = new Node97(5);
		root.left.right = new Node97(6);
		root.left.right.left = new Node97(1);
		root.left.right.right = new Node97(11);
		root.right.right = new Node97(9);
		root.right.right.left = new Node97(4);

		//important method here
		int maxDepth = maxDepth(root);

		System.out.println(maxDepth);
	}

	public static int maxDepth(Node97 root) {

		if(root==null)
			return 0;

		Queue<Node97> q= new LinkedList<>();
		q.offer(root);
		q.offer(null);

		int levels=0;

		while(!q.isEmpty())
		{
			Node97 temp= q.poll();

			if(temp!=null)
			{
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

class Node97
{
	int data;
	Node97 left;
	Node97 right;
	
	Node97(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
