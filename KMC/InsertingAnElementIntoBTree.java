package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class InsertingAnElementIntoBTree {
	
	public static void main(String[] args) {

		Node92 root = new Node92(2);
		root.left = new Node92(7);
		root.right = new Node92(5);
		root.left.right = new Node92(6);
		root.left.right.left = new Node92(1);
		root.left.right.right = new Node92(11);
		root.right.right = new Node92(9);
		root.right.right.left = new Node92(4);

		//BEFORE
		System.out.println("--------------BEFORE--------------");
		inorder(root);

		//important method here
		insert(root,12);

		//AFTER
		System.out.println();
		System.out.println("--------------AFTER---------------");
		inorder(root);
	}

	public static void insert(Node92 root,int key) {

		if(root==null)
		{
			root= new Node92(key);
			return;
		}

		Queue<Node92> q= new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty())
		{
			Node92 temp= q.poll();

			if(temp.left!=null)
				q.offer(temp.left);
			else
			{
				temp.left= new Node92(key);
				break;
			}

			if(temp.right!=null)
				q.offer(temp.right);
			else
			{
				temp.right= new Node92(key);
				break;
			}
		}

	}

	public static void inorder(Node92 root) {
		Node92 temp=root;
		if(temp!=null)
		{
			inorder(temp.left);
			System.out.print(temp.data + " ");
			inorder(temp.right);
		}

	}


}

class Node92
{
	int data;
	Node92 left;
	Node92 right;
	
	Node92(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
