package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class FindCountOfLeavesInBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node102 root = new Node102(2);
		root.left = new Node102(7);
		root.right = new Node102(5);
		root.left.right = new Node102(6);
		root.right.right = new Node102(9);
		root.right.right.left = new Node102(4);

		//important method here
		int count = countLeaves(root);

		System.out.println(count);
	}

	public static int countLeaves(Node102 root) {

		int count=0;
		Queue<Node102> q= new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty())
		{
			Node102 temp= q.poll();
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

class Node102
{
	int data;
	Node102 left;
	Node102 right;
	
	Node102(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
