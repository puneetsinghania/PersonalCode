package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class FindCountOfFullNodesInBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node103 root = new Node103(2);
		root.left = new Node103(7);
		root.right = new Node103(5);
		root.left.right = new Node103(6);
		root.right.right = new Node103(9);
		root.right.right.left = new Node103(4);

		//important method here
		int count = countFullNodes(root);

		System.out.println(count);
	}

	public static int countFullNodes(Node103 root) {

		int count=0;
		Queue<Node103> q= new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty())
		{
			Node103 temp= q.poll();
			if(temp.left!=null && temp.right!=null)
				count++;

			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}

		return count;

	}
	
}

class Node103
{
	int data;
	Node103 left;
	Node103 right;
	
	Node103(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
