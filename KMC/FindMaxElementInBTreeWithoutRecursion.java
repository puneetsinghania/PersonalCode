package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxElementInBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node89 root = new Node89(2);
		root.left = new Node89(7);
		root.right = new Node89(5);
		root.left.right = new Node89(6);
		root.left.right.left = new Node89(1);
		root.left.right.right = new Node89(11);
		root.right.right = new Node89(9);
		root.right.right.left = new Node89(4);
		
		//important method here
		int max=findMax(root);
		
		System.out.println(max);
	}

	public static int findMax(Node89 root) {

		int max= Integer.MIN_VALUE;
		Queue<Node89> q= new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty())
		{
			Node89 temp = q.poll();
			max= Math.max(max, temp.data);

			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
		return max;
	}
	
	
}

class Node89
{
	int data;
	Node89 left;
	Node89 right;
	
	Node89(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
