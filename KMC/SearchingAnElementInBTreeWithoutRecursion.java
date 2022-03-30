package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class SearchingAnElementInBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node91 root = new Node91(2);
		root.left = new Node91(7);
		root.right = new Node91(5);
		root.left.right = new Node91(6);
		root.left.right.left = new Node91(1);
		root.left.right.right = new Node91(11);
		root.right.right = new Node91(9);
		root.right.right.left = new Node91(4);
		
		//important method here
		boolean res = search(root,5);
		
		System.out.println(res);
	}

	public static boolean search(Node91 root,int key) {
		
		Queue<Node91> q= new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty())
		{
			Node91 temp = q.poll();
			if(temp.data==key)
				return true;

			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}
		return false;
	}
	
	
}

class Node91
{
	int data;
	Node91 left;
	Node91 right;
	
	Node91(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
