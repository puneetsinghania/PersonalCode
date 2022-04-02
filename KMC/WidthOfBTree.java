package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfBTree {
	
	public static void main(String[] args) {

		Node108 root = new Node108(2);
		root.left = new Node108(7);
		root.left.left = new Node108(11);
		root.right = new Node108(5);
		root.left.right = new Node108(6);
		root.right.right = new Node108(9);
		root.right.right.left = new Node108(4);

		//important method here
		int width = widthOfBinaryTree(root);

		System.out.println(width);
	}

	public static int widthOfBinaryTree(Node108 root) {

		if(root==null)
			return 0;

		int max= Integer.MIN_VALUE;
		int count=0;

		Queue<Node108> q = new LinkedList<>();
		q.offer(root);
		q.offer(null);

		while(!q.isEmpty())
		{
			Node108 temp= q.poll();

			if(temp!=null)
			{
				count++;

				if(temp.left!=null)
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
			}
			else
			{
				max= Math.max(max,count);
				count=0;

				q.offer(null);

				if(q.peek()==null)
					break;
			}
		}
		return max;

	}
	
}

class Node108
{
	int data;
	Node108 left;
	Node108 right;
	
	Node108(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
