package KMC;

public class FindingMaxElementInBSTree {
	
	public static void main(String[] args) {

		Node117 root = new Node117(4);
		root.left = new Node117(2);
		root.right = new Node117(7);
		root.left.left = new Node117(1);
		root.left.right = new Node117(3);

		//important method here
		Node117 maxElement = findMax(root);

		System.out.println(maxElement.data);
	}

	public static Node117 findMax(Node117 root) {

		if(root==null)
			return null;

		if(root.right!=null)
		{
			root=findMax(root.right);
		}

		return root;
	}

}

class Node117
{
	int data;
	Node117 left;
	Node117 right;
	
	Node117(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
