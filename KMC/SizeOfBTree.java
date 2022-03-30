package KMC;

public class SizeOfBTree {
	
	public static void main(String[] args) {

		Node93 root = new Node93(2);
		root.left = new Node93(7);
		root.right = new Node93(5);
		root.left.right = new Node93(6);
		root.left.right.left = new Node93(1);
		root.left.right.right = new Node93(11);
		root.right.right = new Node93(9);
		root.right.right.left = new Node93(4);

		//important method here
		int size = size(root);

		System.out.println(size);
	}

	public static int size(Node93 root) {

		if(root==null)
			return 0;

		return size(root.left) + 1 + size(root.right);

	}
	
}

class Node93
{
	int data;
	Node93 left;
	Node93 right;
	
	Node93(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
