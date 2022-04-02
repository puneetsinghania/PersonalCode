package KMC;

public class DiameterOfBTree {
	
	public static void main(String[] args) {

		Node107 root = new Node107(2);
		root.left = new Node107(7);
		root.right = new Node107(5);
		root.left.right = new Node107(6);
		root.right.right = new Node107(9);
		root.right.right.left = new Node107(4);

		//important method here
		int diameter = diameterOfBinaryTree(root);

		System.out.println(diameter);
	}

	//diameter= no of edges
	public static int diameterOfBinaryTree(Node107 root) {

		if(root==null)
			return 0;

		//if path goes through root
		int len1= height(root.left) + height(root.right);

		//if path does not go through root
		int len2= Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));

		return Math.max(len1,len2);

	}

	public static int height(Node107 root)
	{
		if (root==null)
			return 0;

		int lDepth=height(root.left);
		int rDepth=height(root.right);

		int max= Math.max(lDepth,rDepth);

		return max+1;
	}
	
}

class Node107
{
	int data;
	Node107 left;
	Node107 right;
	
	Node107(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
