package KMC;

public class RemoveLeavesOfBTree {
	
	public static void main(String[] args) {

		Node127 root = new Node127(2);
		root.left = new Node127(7);
		root.right = new Node127(5);
		root.left.right = new Node127(6);
		root.left.right.left = new Node127(1);
		root.left.right.right = new Node127(11);
		root.right.right = new Node127(9);
		root.right.right.left = new Node127(4);

		//BEFORE
		System.out.println("--------------BEFORE--------------");
		inorder(root);

		//important method here
		Node127 modRoot = removeAll(root);

		//AFTER
		System.out.println();
		System.out.println("--------------AFTER---------------");
		inorder(modRoot);
	}

	public static Node127 removeAll(Node127 root) {

		if(root==null)
			return null;

		if(root.left==null && root.right==null)
			return null;

		root.left = removeAll(root.left);
		root.right = removeAll(root.right);

		return root;
	}

	public static void inorder(Node127 root) {
		Node127 temp=root;
		if(temp!=null)
		{
			inorder(temp.left);
			System.out.print(temp.data + " ");
			inorder(temp.right);
		}

	}

}

class Node127
{
	int data;
	Node127 left;
	Node127 right;
	
	Node127(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
