package KMC;

public class MinDepthOfBTree {
	
	public static void main(String[] args) {

		Node98 root = new Node98(2);
		root.left = new Node98(7);
		root.right = new Node98(5);
		root.left.right = new Node98(6);
		root.right.right = new Node98(9);
		root.right.right.left = new Node98(4);

		//important method here
		int minDepth = minDepth(root);

		System.out.println(minDepth);
	}

	public static int minDepth(Node98 root) {

		if(root==null)
			return 0;

		if(root.left==null && root.right==null)
			return 1;

		if(root.left==null)
			return minDepth(root.right)+1;

		if(root.right==null)
			return minDepth(root.left)+1;

		int minLeft= minDepth(root.left);
		int minRight= minDepth(root.right);

		int min= Math.min(minLeft,minRight);

		return min+1;

	}
	
}

class Node98
{
	int data;
	Node98 left;
	Node98 right;
	
	Node98(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
