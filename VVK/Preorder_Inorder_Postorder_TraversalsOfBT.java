package VVK;

import java.util.LinkedList;
import java.util.Queue;

public class Preorder_Inorder_Postorder_TraversalsOfBT {
		
	public static void main(String[] args) {
		
		Node67 root = new Node67(1); 
		root.left = new Node67(2);
		root.right = new Node67(3);
		root.left.left = new Node67(4);
		root.left.right = new Node67(5);
		
		//important method here 
		System.out.println("==============PREORDER=============");
		preorder(root);
		
		System.out.println();
		
		System.out.println("==============INORDER=============");
		inorder(root);
		
		System.out.println();
		
		System.out.println("==============POSTORDER=============");
		postorder(root);
		
	}
	
	public static void preorder(Node67 root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
	}
	
	public static void inorder(Node67 root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
	}
	
	public static void postorder(Node67 root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
		
	}

}

class Node67
{
	int data;
	Node67 left;
	Node67 right;
	
	Node67(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
