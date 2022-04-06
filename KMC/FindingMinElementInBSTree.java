package KMC;

public class FindingMinElementInBSTree {
	
	public static void main(String[] args) {

		Node116 root = new Node116(4);
		root.left = new Node116(2);
		root.right = new Node116(7);
		root.left.left = new Node116(1);
		root.left.right = new Node116(3);

		//important method here
		Node116 minElement = findMin(root);

		System.out.println(minElement.data);
	}

	public static Node116 findMin(Node116 root) {

		if(root==null)
			return null;

		if(root.left!=null)
		{
			root = findMin(root.left);
		}
		return root;

	}

}

class Node116
{
	int data;
	Node116 left;
	Node116 right;
	
	Node116(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
