package KMC;

public class FindMaxElementInBTree {
	
	public static void main(String[] args) {

		Node88 root = new Node88(2);
		root.left = new Node88(7);
		root.right = new Node88(5);
		root.left.right = new Node88(6);
		root.left.right.left = new Node88(1);
		root.left.right.right = new Node88(11);
		root.right.right = new Node88(9);
		root.right.right.left = new Node88(4);
		
		//important method here
		int max=findMax(root);
		
		System.out.println(max);
	}

	public static int findMax(Node88 root) {

		if(root==null)
			return Integer.MIN_VALUE;

		int max= root.data;
		int leftMax= findMax(root.left);
		int rightMax=findMax(root.right);

		max= Math.max(max,leftMax);
		max= Math.max(max,rightMax);

		return max;
	}
	
	
}

class Node88
{
	int data;
	Node88 left;
	Node88 right;
	
	Node88(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
