package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class DeletingAnElementFromBTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node101 root = new Node101(2);

		//BEFORE
		System.out.println("--------------BEFORE--------------");
		inorder(root);

		//important method here
		root =deleteNode(root,2);

		//AFTER
		System.out.println();
		System.out.println("--------------AFTER---------------");
		inorder(root);
	}

	public static Node101 deleteNode(Node101 root, int key) {

		if(root==null)
			return null;

		if(root.left==null && root.right==null)
		{
			if(root.data==key)
			{
				root=null;
			}
			return root;
		}

		Node101 temp=null;
		Node101 toDel=null;
		Node101 deepest=null;
		Node101 deepParent=null;

		Queue<Node101> q= new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty())
		{
			temp= q.poll();
			if(temp.data==key)
			{
				toDel=temp;
			}

			if(temp.left!=null)
			{
				deepParent=temp;
				q.offer(temp.left);
			}
			if(temp.right!=null)
			{
				deepParent=temp;
				q.offer(temp.right);
			}
		}

		deepest=temp;
		if(toDel!=null)
		{
			toDel.data=deepest.data;

			if(deepParent.left==deepest)
				deepParent.left=null;
			else
				deepParent.right=null;
		}

		return root;
	}

	public static void inorder(Node101 root) {
		Node101 temp=root;
		if(temp!=null)
		{
			inorder(temp.left);
			System.out.print(temp.data + " ");
			inorder(temp.right);
		}

	}
	
}

class Node101
{
	int data;
	Node101 left;
	Node101 right;
	
	Node101(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
