package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node94 root = new Node94(2);
		root.left = new Node94(7);
		root.right = new Node94(5);
		root.left.right = new Node94(6);
		root.left.right.left = new Node94(1);
		root.left.right.right = new Node94(11);
		root.right.right = new Node94(9);
		root.right.right.left = new Node94(4);

		//important method here
		int size = size(root);

		System.out.println(size);
	}

	public static int size(Node94 root) {

		int size = 0;
		Queue<Node94> q= new LinkedList<>();

		q.offer(root);
		while(!q.isEmpty())
		{
			Node94 temp= q.poll();
			size++;

			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}

		return size;
	}
	
}

class Node94
{
	int data;
	Node94 left;
	Node94 right;
	
	Node94(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
