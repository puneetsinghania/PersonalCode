package KMC;

public class DeletingABTree {
	
	public static void main(String[] args) {

		Node95 root = new Node95(2);
		root.left = new Node95(7);
		root.right = new Node95(5);
		root.left.right = new Node95(6);
		root.left.right.left = new Node95(1);
		root.left.right.right = new Node95(11);
		root.right.right = new Node95(9);
		root.right.right.left = new Node95(4);

		//BEFORE
		System.out.println("--------------BEFORE--------------");
		inorder(root);

		//important method here
		root=delete(root);

		//AFTER
		System.out.println();
		System.out.println("--------------AFTER---------------");
		inorder(root);
		
	}

	public static Node95 delete(Node95 root) {

		if(root==null)
			return null;

		deleteTree(root);
		root=null;

		return root;

	}

	public static void deleteTree(Node95 root) {
		root=null;
	}

	public static void inorder(Node95 root) {
		Node95 temp=root;
		if(temp!=null)
		{
			inorder(temp.left);
			System.out.print(temp.data + " ");
			inorder(temp.right);
		}

	}
	
}

class Node95
{
	int data;
	Node95 left;
	Node95 right;
	
	Node95(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
