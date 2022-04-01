package KMC;

public class MaxDepthOfBTree {
	
	public static void main(String[] args) {

		Node96 root = new Node96(2);
		root.left = new Node96(7);
		root.right = new Node96(5);
		root.left.right = new Node96(6);
		root.left.right.left = new Node96(1);
		root.left.right.right = new Node96(11);
		root.right.right = new Node96(9);
		root.right.right.left = new Node96(4);

		//important method here
		int maxDepth = maxDepth(root);

		System.out.println(maxDepth);
	}

	public static int maxDepth(Node96 root) {

		if(root==null)
			return 0;

		int lDepth= maxDepth(root.left);
		int rDepth= maxDepth(root.right);

		int max= Math.max(lDepth,rDepth);

		return max+1;

	}
	
}

class Node96
{
	int data;
	Node96 left;
	Node96 right;
	
	Node96(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
