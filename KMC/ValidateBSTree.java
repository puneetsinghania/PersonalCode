package KMC;

public class ValidateBSTree {
	
	public static void main(String[] args) {

		Node120 root = new Node120(20);
		root.left = new Node120(8);
		root.right = new Node120(22);
		root.left.left = new Node120(4);
		root.left.right = new Node120(12);
		root.left.right.left = new Node120(10);
		root.left.right.right = new Node120(14);

		//important method here
		boolean isBST = isValidBST(root);

		System.out.println(isBST);
	}

	public static boolean isValidBST(Node120 root) {

		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static boolean isValidBST(Node120 root, long min, long max) {

		if(root==null)
			return true;

		if(root.data>=max || root.data<=min)
			return false;

		return isValidBST(root.left, min, root.data)
				&& isValidBST(root.right, root.data, max);

	}

}

class Node120
{
	int data;
	Node120 left;
	Node120 right;
	
	Node120(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
