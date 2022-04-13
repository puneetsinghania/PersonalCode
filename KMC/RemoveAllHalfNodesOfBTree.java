package KMC;

public class RemoveAllHalfNodesOfBTree {
	
	public static void main(String[] args) {

		Node126 root = new Node126(2);
		root.left = new Node126(7);
		root.right = new Node126(5);
		root.left.right = new Node126(6);
		root.left.right.left = new Node126(1);
		root.left.right.right = new Node126(11);
		root.right.right = new Node126(9);
		root.right.right.left = new Node126(4);

		//BEFORE
		System.out.println("--------------BEFORE--------------");
		inorder(root);

		//important method here
		Node126 modRoot = removeAll(root);

		//AFTER
		System.out.println();
		System.out.println("--------------AFTER---------------");
		inorder(modRoot);
	}

	public static Node126 removeAll(Node126 root) {

		if(root==null)
			return null;

		root.left = removeAll(root.left);
		root.right = removeAll(root.right);

		//if leaf node then dont touch
		if(root.left==null && root.right==null)
			return root;

		//if half node has no left then return its right node as new root
		if(root.left==null)
		{
			Node126 newroot= root.right;
			return newroot;
		}

		//if half node has no right then return its left node as new root
		if(root.right==null)
		{
			Node126 newroot= root.left;
			return newroot;
		}

		return root;

	}

	public static void inorder(Node126 root) {
		Node126 temp=root;
		if(temp!=null)
		{
			inorder(temp.left);
			System.out.print(temp.data + " ");
			inorder(temp.right);
		}

	}

}

class Node126
{
	int data;
	Node126 left;
	Node126 right;
	
	Node126(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
