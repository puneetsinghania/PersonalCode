package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class FindDeepestNodeinBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node100 root = new Node100(2);
		root.left = new Node100(7);
		root.right = new Node100(5);
		root.left.right = new Node100(6);
		root.right.right = new Node100(9);
		root.right.right.left = new Node100(4);

		//important method here
		Node100 deepestNode = deepestNode(root);

		System.out.println(deepestNode.data);
	}

	public static Node100 deepestNode(Node100 root) {

		if(root==null)
			return null;

		Node100 temp= null;
		Queue<Node100> q = new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty())
		{
			temp= q.poll();

			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);

		}

		return temp;

	}
	
}

class Node100
{
	int data;
	Node100 left;
	Node100 right;
	
	Node100(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
