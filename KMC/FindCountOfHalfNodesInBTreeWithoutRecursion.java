package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class FindCountOfHalfNodesInBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node104 root = new Node104(2);
		root.left = new Node104(7);
		root.right = new Node104(5);
		root.left.right = new Node104(6);
		root.right.right = new Node104(9);
		root.right.right.left = new Node104(4);

		//important method here
		int count = countHalfNodes(root);

		System.out.println(count);
	}

	public static int countHalfNodes(Node104 root) {

		int count=0;
		Queue<Node104> q= new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty())
		{
			Node104 temp= q.poll();
			if((temp.left!=null && temp.right==null) || (temp.left==null && temp.right!=null))
				count++;

			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}

		return count;

	}
	
}

class Node104
{
	int data;
	Node104 left;
	Node104 right;
	
	Node104(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
