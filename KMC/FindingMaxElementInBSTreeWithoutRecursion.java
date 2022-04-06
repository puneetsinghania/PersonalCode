package KMC;

public class FindingMaxElementInBSTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node118 root = new Node118(4);
		root.left = new Node118(2);
		root.right = new Node118(7);
		root.left.left = new Node118(1);
		root.left.right = new Node118(3);

		//important method here
		int maxElement = findMax(root);

		System.out.println(maxElement);
	}

	public static int findMax(Node118 root) {

		while(root.right!=null)
		{
			root=root.right;
		}

		return root.data;
	}

}

class Node118
{
	int data;
	Node118 left;
	Node118 right;
	
	Node118(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
